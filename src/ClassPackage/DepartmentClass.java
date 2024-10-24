/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPackage;
import java.io.*;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class DepartmentClass {
   
    FileSystem fileSystem =new FileSystem("departments and designations.txt");
    
    
    private String DepName;
    private String Designations;
    
    public DepartmentClass(){
    
    }
    
    public DepartmentClass(String DepName, String Designations) {
        this.DepName = DepName;
        this.Designations = Designations;
    }

    public String getDepName() {
        return DepName;
    }

    public void setDepName(String DepName) {
        this.DepName = DepName;
    }

    public String getDesignations() {
        return Designations;
    }

    public void setDesignations(String Designations) {
        this.Designations = Designations;
    }
    
    
    
   public boolean addDepartment(){
      if(!fileSystem.createNewFile()){
          String record = DepName+"---"+Designations;
          System.err.println(DepName+"---"+Designations);
          return fileSystem.writeDataToFile(record);
      }
      return false;
    }
     
  
   public boolean checkDepAndDesAvailability(String Department, String Designation){
      boolean Found = false;
      try{
          String[] words = null; //Initialize the word array
          BufferedReader brEmp = fileSystem.readFile();
          String FindLine, Record;
          
          Record = Department+"---"+Designation;
          
          while((FindLine = brEmp.readLine())!=null)//Reading content from the file
          {
       
                  if(FindLine.equals(Record)){ //Search for the given word  
                      Found = true; 
                  } 
          }
          
      }
      catch(IOException e){
          System.out.println("An error occured "+e);
      }
      return Found;
  }
   
        public String[][] viewAllDeps() {
        List<String[]> departments = new ArrayList<>();
        String department;

        BufferedReader brDep = fileSystem.readFile(); // Creating memory object

        try {
            while ((department = brDep.readLine()) != null) {
                String[] words = department.split("---");

                // Check if the array has the expected length
                if (words.length >= 1) {
                    departments.add(new String[]{words[0], words[1]});
                } else {
                    // Handle the case where the split did not produce the expected result
                    System.err.println("Unexpected format: " + department);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return departments.toArray(new String[0][]);
    }

}
