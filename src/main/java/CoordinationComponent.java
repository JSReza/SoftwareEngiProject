import java.util.*;

public class CoordinationComponent {

    public void connect() {
        System.out.println("CoordinationComponent connected.");
    }

    public void disconnect() {
        System.out.println("CoordinationComponent disconnected.");
    }

    public void sendData(String destination, String data) {
        System.out.println("Sending data to " + destination + ": " + data);
    }

    public void coordinate(String data) {
        System.out.println("Coordinating with data: " + data);
    }

    private static final DataStorageAPIImplementation dataStorage = new DataStorageAPIImplementation();
    private static final Computation computation = new Computation();

    public static void main(String[] args) {
        simulateHighLoad();
    }

    private static void simulateHighLoad() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of inputs to process: ");
            int numInputs = sc.nextInt();

            long startTime = System.currentTimeMillis(); // Start timing
            for (int i = 0; i < numInputs; i++) {
                int input = i; // Simulate input as sequential integers
                long methodStartTime = System.nanoTime(); // Start timing for each iteration
                String output = computation.convertToHexString(input);
                dataStorage.writeData(input);
                long methodEndTime = System.nanoTime(); // End timing for each iteration
                System.out.println(input + " has been converted to hex and is now " + output);
                System.out.println("Iteration execution time: " + (methodEndTime - methodStartTime) + " ns");
            }
            long endTime = System.currentTimeMillis(); // End timing
            System.out.println("simulateHighLoad execution time: " + (endTime - startTime) + " ms");

            System.out.println("Processing complete.");
        }
    }
}