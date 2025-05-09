package API_Package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class DataTransferPrototype{

    private static final String DEFAULT_DELIMITER = ",";

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