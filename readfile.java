import java.io.*;

class FileReadWriteExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        
        // Writing to a file
        writeToFile(fileName, "Hello, this is a simple example of file handling in Java.\nHave a great day!");

        // Reading from the file
        readFromFile(fileName);
    }

    // Method to write to a file
    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to read from a file
    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
