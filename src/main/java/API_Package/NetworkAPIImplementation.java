package API_Package;
public class NetworkAPIImplementation {
    private boolean isConnected;
    private String connectionStatus;
    private final int port;

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public NetworkAPIImplementation(int port) {
        this.port = port;
        this.isConnected = false;
        this.connectionStatus = "Disconnected";
    }

    public void connect() {
        this.isConnected = true;
        this.connectionStatus = "Connected";
        System.out.println("Connected to port: " + this.port);
    }

    public void disconnect() {
        this.isConnected = false;
        this.connectionStatus = "Disconnected";
        System.out.println("Disconnected from port: " + this.port);
    }

    public void sendData(String destination, String data) {
        if (!isConnected) {
            System.out.println("Cannot send data. Not connected.");
            return;
        }
        System.out.println("Sending data to " + destination + ": " + data);
    }
    public String readData(String source) {
        if (!isConnected) {
            System.out.println("Cannot read data. Not connected.");
            return null;
        }
        System.out.println("Reading data from " + source);
        // Simulate reading data (this could be replaced with actual logic)
        return "Sample data from " + source;
    }
}
