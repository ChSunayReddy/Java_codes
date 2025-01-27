import java.io.*;
import java.util.*;

public class Phonebook_sorting {

    public static void main(String[] args) {
        // Path to the input phonebook file
        String filePath = "Phonebook.txt";

        // Data structure to store city-wise records
        TreeMap<String, TreeMap<String, String>> phonebook = new TreeMap<>();

        // Read and process the phonebook
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+"); // Split line into components
                if (parts.length == 3) {
                    String name = parts[0];
                    String city = parts[1];
                    String phoneNumber = parts[2];

                    // Add city to the phonebook if not already present
                    phonebook.putIfAbsent(city, new TreeMap<>());

                    // Add name and phone number under the city
                    phonebook.get(city).put(name, phoneNumber);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Print the sorted phonebook
        System.out.println("Sorted Phonebook:");
        for (Map.Entry<String, TreeMap<String, String>> cityEntry : phonebook.entrySet()) {
            String city = cityEntry.getKey();
            System.out.println("City: " + city);
            for (Map.Entry<String, String> personEntry : cityEntry.getValue().entrySet()) {
                String name = personEntry.getKey();
                String phoneNumber = personEntry.getValue();
                System.out.println("  Name: " + name + ", Phone: " + phoneNumber);
            }
        }
    }
}
