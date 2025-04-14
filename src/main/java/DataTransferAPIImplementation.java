import java.util.List;

import API_Package.DataTransferAPI;
import API_Package.NetworkAPIImplementation;

public class DataTransferAPIImplementation implements DataTransferAPI {

    final NetworkAPIImplementation networkAPI;
    final int bufferSize;

    public DataTransferAPIImplementation(NetworkAPIImplementation networkAPI) {
        if (networkAPI == null) {
            throw new IllegalArgumentException("Network API cannot be null");
        }
        this.networkAPI = networkAPI;
        this.bufferSize = 1024;
    }

    public void transferData(String source, String destination, String delimiter) {
        try {
            if (source == null || destination == null) {
                throw new IllegalArgumentException("Source and destination cannot be null");
            }

            String data = networkAPI.readData(source);
            String[] chunks = data.split(delimiter);

            for (String chunk : chunks) {
                networkAPI.sendData(destination, chunk);
            }

            System.out.println("Data transfer from " + source + " to " + destination + " completed successfully.");

        } catch (Exception e) {
            throw new RuntimeException("Unexpected error during data transfer: " + e.getMessage(), e);
        }
    }

    public void convertDecimalToHex(int decimal, String destination) {
        try {
            if (destination == null) {
                throw new IllegalArgumentException("Destination cannot be null");
            }

            String hexValue = Integer.toHexString(decimal).toUpperCase();
            String formattedHex = "0x" + hexValue;
            networkAPI.sendData(destination, formattedHex);

            System.out.println("Converted decimal " + decimal + " to hex " + formattedHex);

        } catch (Exception e) {
            throw new RuntimeException("Error converting decimal to hex: " + e.getMessage(), e);
        }
    }

    @Override
    public void sendData() {
        try {
        } catch (Exception e) {
            throw new RuntimeException("Failed to send data: " + e.getMessage(), e);
        }
    }

    public void sendData(List<String> outputData) {
        try {
            if (outputData == null) {
                throw new IllegalArgumentException("Output data cannot be null");
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to send data list: " + e.getMessage(), e);
        }
    }
}
