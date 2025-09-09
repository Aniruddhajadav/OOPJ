import java.io.*;
public class p15_FileOperations {
    public static void main(String[] args) { 
        String fileName = "demo.txt";
        
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("This is the first line.\n");
            writer.write("This is the second line.\n");
            writer.close(); 
            System.out.println("File created and written successfully."); 
        } catch (IOException e) {
            System.out.println("Error during writing: " + e.getMessage()); 
        }
        
        try { 
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("This is an appended line.\n");
            writer.close(); 
            System.out.println("File modified (appended) successfully."); 
        } catch (IOException e) { 
            System.out.println("Error during modifying: " + e.getMessage()); 
        }
        
        try { 
            BufferedReader reader = new BufferedReader(new FileReader(fileName)); 
            String line; 
            System.out.println("\nReading from the file:");
            while ((line = reader.readLine()) != null) { 
                System.out.println(line); 
            } 
            reader.close(); 
        } catch (IOException e) { 
            System.out.println("Error during reading: " + e.getMessage()); 
        } 
    }
}