package ClassPackage;
import java.io.*;
import javax.swing.JOptionPane;

/**
 * The FileSystem class definition
 */
public class FileSystem {
    // The default file path where the file will be created or accessed
    private static String file_path = "D:\\2nd Sem\\Assigments\\OOP\\CSE-4006-Coursework-Hasara\\Hasara\\Hasara\\src\\Data\\";
    
    // The File object representing the file
    File file;
    
    // The name of the file
    private String fileName;
    
    // Constructor to initialize the FileSystem with a specific file name
    public FileSystem(String fileName) {
        this.fileName = fileName;
        createNewFile(); // Ensure that the file is created or exists
    }
    
    // Method to create a new file or check if the file already exists
    public boolean createNewFile() {
        try {
            file = new File(file_path + fileName);
            
            // Attempt to create a new file
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
                return true; // File creation successful
            } else {
                System.out.println("File Already Exists!");
                return false; // File already exists
            }
        } catch (IOException ex) {
            System.out.println("Something went wrong with creating the file" + ex);
            return false; // An error occurred during file creation
        }
    }
    
    // Method to write data to the file
    public boolean writeDataToFile(String Record) {
        try {
            file.createNewFile(); // Ensure that the file exists
            
            // Create FileWriter and BufferedWriter for writing data
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            // Write the record and add a new line
            bufferedWriter.write(Record);
            bufferedWriter.newLine();
            
            // Close the writers
            bufferedWriter.close();
            fileWriter.close();
            return true; // Writing to file successful
        } catch (IOException ex) {
            System.out.println("Something went wrong with writing to the file" + ex);
            return false; // An error occurred during writing
        }
    }
    
    public boolean removeUserDataFromFile(String uName, String utype) throws FileNotFoundException, IOException {
        try {
            String FindLine, UserType, UserName;
            boolean valid = false; // Move the declaration outside the loop

            // Create FileReader and BufferedReader for reading data
            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);

            // Create a temporary file
            File tempFile = new File("tempFile.txt");
            FileWriter fWriter = new FileWriter(tempFile);
            BufferedWriter bWriter = new BufferedWriter(fWriter);

            while (null != (FindLine = bReader.readLine())) {
                UserName = FindLine.split("---")[0];
                UserType = FindLine.split("---")[2];
                if (uName.equals(UserName) && utype.equals(UserType)) {
                    valid = true; // Set valid to true when the condition is met
                    continue; // Skip the rest of the loop and move to the next iteration
                }

                // Write the line to the temporary file
                bWriter.write(FindLine);
                bWriter.newLine();
            }

            // Close readers and writers outside the loop
            bReader.close();
            fReader.close();
            bWriter.close();
            fWriter.close();

            // Replace the original file with the temporary file
            file.delete(); // Delete the original file
            tempFile.renameTo(file); // Rename the temporary file to the original file name

            return valid; // Return the value of valid

        } catch (IOException ex) {
                System.out.println("Error removing data from file: " + ex);
                return false; // Data removal failed
        }
    }
    
    // Method to read data from the file and return a BufferedReader
    public BufferedReader readFile() {
        if (!createNewFile()) {
            try {
                // Create FileReader and BufferedReader for reading data
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                return bufferedReader; // Return the BufferedReader
            } catch (IOException ex) {
                System.out.println("Something went wrong with reading the file" + ex);
            }
        }
        return null; // Return null if there's an issue creating the file or FileReader
    }
    
}
