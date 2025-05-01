import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

        // Mock System.in using Mockito (simulate input if needed)
        InputStream originalIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream("dummy input".getBytes()));
            assertDoesNotThrow(() -> {
                fastDataStorage.readData();
            });
        } finally {
            System.setIn(originalIn);
        }
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

        // Mock System.in using Mockito (simulate input if needed)
        InputStream originalIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream("dummy input".getBytes()));
            assertDoesNotThrow(() -> {
                fastDataStorage.readData();
            });
        } finally {
            System.setIn(originalIn);
        }
    }
}
