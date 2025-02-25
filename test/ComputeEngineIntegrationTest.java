import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ComputeEngineIntegrationTest {
    private TestInputConfig inputConfig;
    private TestOutputConfig outputConfig;
    private TestDataStorageAPI dataStorage;
    private DataTransferAPIImplementation dataTransfer;
    private NetworkAPIImplementation network;
    private int port;
    @BeforeEach
    void setUp() {

        inputConfig = new TestInputConfig();
        outputConfig = new TestOutputConfig();

        network = new NetworkAPIImplementation(port);
        dataStorage = new TestDataStorageAPI(inputConfig, outputConfig);
        dataTransfer = new DataTransferAPIImplementation(network);
    }


    @DisplayName("Compute Engine Integration Test with [1,10,25]")
    void testComputeEngineWithInitialInput() {
       
        inputConfig.addTestData(1);
        inputConfig.addTestData(10);
        inputConfig.addTestData(25);
        
        dataStorage.processData();
        dataTransfer.sendData(outputConfig.getOutputData());
        
        List<String> results = outputConfig.getOutputData();
        
   
        assertNotNull(results, "Output should not be null");
        assertEquals(3, results.size(), "Should have 3 output elements");
    
        List<String> expected = Arrays.asList("1", "10", "25");
        assertTrue(results.containsAll(expected), 
                  "Output should contain all input values");
    }

    @AfterEach
    void tearDown() {
        inputConfig.clearData();
        outputConfig.clearData();

    }
}