/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClassPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeClass {
    private String Name;
    private int Age;
    private String Address;
    private String EPF;
    private String Department;
    private String Designation;
    private int EmpCount;
    
    FileSystem fileSystem =new FileSystem("employee.txt");

    public EmployeeClass() {
        
    }
    
    public EmployeeClass(String Name, String Department, String Designation) {
        this.Name = Name;
        this.Department = Department;
        this.Designation = Designation;
    }
    
    public EmployeeClass(String Name, int Age, String Address, String EPF, String Department, String Designation) {
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.EPF = EPF;
        this.Department = Department;
        this.Designation = Designation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public String getEPF() {
        return EPF;
    }

    public void setEPF(String EPF) {
        this.EPF = EPF;
    }
    
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
    
    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public int getEmpCount() {
        return EmpCount;
    }

    public void setEmpCount(int EmpCount) {
        this.EmpCount = EmpCount;
    }
    
    public boolean addEmployee() {
        if(!fileSystem.createNewFile())
        {
            String Record = Name+ "---"+ Age+ "---"+ Address+ "---"+ EPF+ "---"+ Department+ "---"+ Designation;
            return fileSystem.writeDataToFile(Record);
        }
        return false;
    }
    
    public String[] viewAllEmployees() {
        String User, allEmployees = "";
        String[] words = null;
        int count = 0;

        // Assuming 'fileSystem' is an instance of your file handling class
        BufferedReader bufferedReader = fileSystem.readFile();

        try {
            while ((User = bufferedReader.readLine()) != null) {
                words = User.split("---");
                // Concatenate employee information into a formatted string
                allEmployees = allEmployees + words[0] + "\t" + words[1] + "\t" + words[2] + "\t" + words[3] + "\t" + words[4] + "\t" + words[5] + "\n";
                count++;
            }
        } catch (IOException ex) {
            System.out.println("Error View Employees" + ex);
        }

        // Set the employee count (assuming 'setEmpCount' is a method in your class)
        setEmpCount(count);

        // Split the concatenated string into an array of lines
        String[] allEmployeesArray = allEmployees.split("\n");

        // Return the array of employee information
        return allEmployeesArray;
    }

        
    public boolean checkEPFAvailability(String EPF){
      boolean EPFound = false;
      try{
          String[] words = null; //Initialize the word array
          BufferedReader brEmp = fileSystem.readFile();
          String FindLine;
          
          while((FindLine = brEmp.readLine())!=null)//Reading content from the file
          {
              words = FindLine.split("---"); //Split the word using space 
              for(String word : words){
                  if(word.equals(EPF)){ //Search for the given word 
                      EPFound = true; 
                  } 
              }
          }
          
      }
      catch(IOException e){
          System.out.println("An error occured "+e);
      }
      return EPFound;
  }
    
   
    
    public List<EmployeeClass> SearchEmployee(String keyword) {
        List<EmployeeClass> matchingEmployees = new ArrayList<>();
        try {
            String[] words = null;
            BufferedReader brEmp = fileSystem.readFile(); // Creating memory object
            String employee; // Initializing variable

            while ((employee = brEmp.readLine()) != null) {
                words = employee.split("---"); // Split the line using ---

                for (String word : words) {
                    if (word.equals(keyword)) {
                        EmployeeClass matchingEmployee = new EmployeeClass();
                        matchingEmployee.setName(words[0]);
                        matchingEmployee.setAge(Integer.parseInt(words[1]));
                        matchingEmployee.setAddress(words[2]);
                        matchingEmployee.setEPF(words[3]);
                        matchingEmployee.setDepartment(words[4]);
                        matchingEmployee.setDesignation(words[5]);

                        matchingEmployees.add(matchingEmployee);
                        break; // Break only the inner loop when a match is found
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception for debugging purposes
        }
        return matchingEmployees;
    }

}
