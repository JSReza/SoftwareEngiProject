import org.junit.Test;
import static org.junit.Assert.*;

public class apiSmokeTest3 {

    @Test
    public void testBasicNetworkConnection() {
        NetworkAPI network = new NetworkAPI();
        assertTrue("Network should initialize successfully", network.initialize());
    }

    @Test
    public void testConnectionStatus() {
        NetworkAPI network = new NetworkAPI();
        network.initialize();
        assertTrue("Network should be connected", network.isConnected());
    }

    @Test
    public void testDisconnection() {
        NetworkAPI network = new NetworkAPI();
        network.initialize();
        network.disconnect();
        assertFalse("Network should be disconnected", network.isConnected());
    }

    @Test
    public void testReconnection() {
        NetworkAPI network = new NetworkAPI();
        network.initialize();
        network.disconnect();
        assertTrue("Network should reconnect successfully", network.reconnect());
    }
}
