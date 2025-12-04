// Maanya and Twisha 12/4/25
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class GitTestCode{
	public static void main(String[] args) {
	        // List of files to process
	        String[] files = {"Frankenstein.txt", "RomeoJuliet.txt"};

	        for (String fileName : files) {
	            try {
	                System.out.println("Processing file: " + fileName);

	                long startTime = System.currentTimeMillis();

	                // Read the file using BufferedReader
	                BufferedReader reader = new BufferedReader(new FileReader(fileName));
	                StringBuilder content = new StringBuilder();
	                String line;

	                while ((line = reader.readLine()) != null) {
	                    content.append(line).append(System.lineSeparator());
	                }
	                reader.close();

	                // Remove all vowels (both lowercase and uppercase)
	                String modifiedContent = content.toString().replaceAll("(?i)[aeiou]", "");

	                // Optionally, write back to the same file or a new file
	                String outputFileName = "modified_" + fileName;
	                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
	                writer.write(modifiedContent);
	                writer.close();

	                long endTime = System.currentTimeMillis();
	                System.out.println("Time taken to remove vowels: " + (endTime - startTime) + " ms");
	                System.out.println("Modified file saved as: " + outputFileName + "\n");

	            } catch (IOException e) {
	                System.err.println("Error processing file " + fileName);
	                e.printStackTrace();
	            }
	        }
    }
}