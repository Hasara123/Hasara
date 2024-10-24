package ClassPackage;
import java.io.*;
import javax.imageio.IIOException;

/**
 * The UserClass class definition
 */

public class UserClass {
    private String UserID;
    private String Password;
    private String UserType;
    private int UserCount;
    
    // Create an instance of the FileSystem class with the filename "accounts.txt"
    FileSystem fileSystem = new FileSystem("accounts.txt");

    
    public UserClass() {
 
    }
    
    // Constructor for creating a UserClass instance with UserID, Password, and UserType
    public UserClass(String UserID, String Password, String UserType) {
        this.UserID = UserID;
        this.Password = Password;
        this.UserType = UserType;
    }
    
    // Constructor for creating a UserClass instance with only UserID and Password
    public UserClass(String UserID, String Password) {
        this.UserID = UserID;
        this.Password = Password;
    }

    // Getter method for UserID
    public String getUserID() {
        return UserID;
    }

    // Setter method for UserID
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    // Getter method for Password
    public String getPassword() {
        return Password;
    }

    // Setter method for Password
    public void setPassword(String Password) {
        this.Password = Password;
    }

    // Getter method for UserType
    public String getUserType() {
        return UserType;
    }

    // Setter method for UserType
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    // Getter method for UserCount
    public int getUserCount() {
        return UserCount;
    }

    // Setter method for UserCount
    public void setUserCount(int UserCount) {
        this.UserCount = UserCount;
    }
    
    // Method to add a new user to the file "accounts.txt"
    public boolean addNewUser() {
        if (!fileSystem.createNewFile()) {
            // If the file doesn't exist, create it and write user data to it
            String Record = UserID + "---" + Password + "---" + UserType;
            return fileSystem.writeDataToFile(Record);
        }
        return false;
    }
    
    public boolean removeUser() throws IOException {
       return fileSystem.removeUserDataFromFile(UserID, UserType);
    }
    
    // Method to validate user login credentials
    public boolean validateLogin() {
        try {
            String getUserName,getPassword,getUserType;
            
            // Read user data from the file
            BufferedReader bufferedReader = fileSystem.readFile();
            String user;
            
            // Iterate through each line in the file
            while ((user = bufferedReader.readLine()) != null) {
                getUserName = user.split("---")[0];
                getPassword = user.split("---")[1];
                getUserType = user.split("---")[2];
                
                // Check if the provided UserID and Password match the stored values
                if (getUserName.equals(UserID) && getPassword.equals(Password)) {
                    this.setUserID(getUserName);
                    this.setPassword(getPassword);
                    this.setUserType(getUserType);
                    return true; // Login successful
                }
            }
        } catch (IOException ex) {
            System.out.println("Error Validating Login" + ex);
        }
        return false; // Login failed
    }
    
    // Method to view all users and their types
    public String viewAllUsers() {
        String User, getUserName,getPassword,getUserType, allUsers = "";
        String[] words = null;
        int count = 0;
        
        // Read user data from the file
        BufferedReader bufferedReader = fileSystem.readFile();
        
        try {
            // Iterate through each line in the file
            while ((User = bufferedReader.readLine()) != null) {
                getUserName = User.split("---")[0];
                getPassword = User.split("---")[1];
                getUserType = User.split("---")[2];
                allUsers = allUsers + getUserName + "\t" + getUserType + "\n";
                count++;
            }
        } catch (IOException ex) {
            System.out.println("Error View User" + ex);
        }
        
        setUserCount(count); // Set the total number of users
        return allUsers; // Return a formatted string containing user information
    }


}