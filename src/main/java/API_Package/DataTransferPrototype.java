package API_Package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataTransferPrototype implements DataTransferAPI {

    @Override
    public void sendData() {
        System.out.println("Sending data with no parameters...");
        // Add logic for sending data without parameters
    }

    @Override
    public void sendData(List<String> outputData) {
        System.out.println("Sending data: " + outputData);
        // Add logic for sending data with a list of strings
    }

    private static final String DEFAULT_DELIMITER = ",";

    @Override
    public void transferData(String source, String destination, String delimiter) {
        if (delimiter == null || delimiter.isEmpty()) {
            delimiter = DEFAULT_DELIMITER;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(source));
                FileWriter writer = new FileWriter(destination)) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(delimiter);
                // Process tokens as needed
                writer.write(String.join(delimiter, tokens));
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void convertDecimalToHex(int decimal, String destination) {
        String hexValue = Integer.toHexString(decimal);

        try (FileWriter writer = new FileWriter(destination)) {
            writer.write("Decimal: " + decimal + " -> Hex: " + hexValue);
            writer.write(System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}