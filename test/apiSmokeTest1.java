<<<<<<< HEAD
import org.junit.Test;
import static org.junit.Assert.*;

// Import the DataStorageAPI class
//import DataStorageAPI;
=======
>>>>>>> JRSecondBranch

public class apiSmokeTest1 {

    @Test
    public void basicSmokeTest() {
        DataStorageAPI api = new DataStorageAPI();
        assertNotNull("API instance should not be null", api);
        assertTrue("API should be able to connect", api.connect());
        String testData = "test data";
        assertTrue("Should be able to store data", api.storeData(testData));
        assertEquals("Retrieved data should match stored data",
                testData,
                api.retrieveData());
        assertTrue("API should be able to disconnect", api.disconnect());
    }
}
