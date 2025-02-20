import org.junit.Test;
import static org.junit.Assert.*;

public class apiSmokeTest2 {

    private DataTransferAPI api;

    @Before
    public void setUp() {
        api = new DataTransferAPI();
    }

    @Test
    public void testAPIConnection() {
        assertTrue("API should initialize successfully", api.isConnected());
    }

    @Test
    public void testBasicDataTransfer() {
        String testData = "Test Data";
        boolean transferResult = api.sendData(testData);
        assertTrue("Basic data transfer should succeed", transferResult);
    }

    @Test
    public void testDataReceive() {
        String receivedData = api.receiveData();
        assertNotNull("Received data should not be null", receivedData);
    }

    @After
    public void tearDown() {
        api.disconnect();
    }
}
