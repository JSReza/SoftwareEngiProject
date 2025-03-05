
import java.lang.annotation.Annotation;

import main.java.NetworkAPI;

public class NetworkAPIImplementation implements NetworkAPI {
    private boolean isConnected;
    private String connectionStatus;
    private final int port;

    public NetworkAPIImplementation(int port) {
        this.port = port;
        this.isConnected = false;
        this.connectionStatus = "Disconnected";
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
