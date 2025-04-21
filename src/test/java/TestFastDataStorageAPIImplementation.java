import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFastDataStorageAPIImplementation {

    private FastDataStorageAPIImplementation fastDataStorage;

    @BeforeEach
    public void setUp() {
        fastDataStorage = new FastDataStorageAPIImplementation();
    }

    @Test
    public void testWriteDataAndReadData() {
        // Test writing and reading integer data
        fastDataStorage.writeData(10);
        fastDataStorage.writeData(10);
        fastDataStorage.writeData(20);

        // Simulate reading data
        assertDoesNotThrow(() -> {
            fastDataStorage.readData();
        });
    }

    @Test
    public void testWriteDataPerformance() {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            fastDataStorage.writeData(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Performance test execution time: " + (endTime - startTime) + " ns");
        assertTrue((endTime - startTime) < 1000000000, "Performance test took too long");
    }

    @Test
    public void testHexStorage() {
        fastDataStorage.writeData(255); // Hex representation is "FF"
        fastDataStorage.writeData(255);

        // Simulate reading data
        assertDoesNotThrow(() -> {
            fastDataStorage.readData();
        });
    }
}
