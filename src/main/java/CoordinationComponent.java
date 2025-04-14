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
        Coordinator();
    }

    private static void Coordinator() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int input = sc.nextInt();
            String output = computation.convertToHexString(input);
            dataStorage.writeData(input);
            System.out.println(input + " has been converted to hex and is now " + output);
        }
    }
}