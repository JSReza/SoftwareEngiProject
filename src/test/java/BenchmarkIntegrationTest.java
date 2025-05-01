import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BenchmarkIntegrationTest {

    @Test
    public void benchmarkOriginalVsFastImplementation() {
        DataStorageAPIImplementation originalImplementation = new DataStorageAPIImplementation();
        FastDataStorageAPIImplementation fastImplementation = new FastDataStorageAPIImplementation();

        int numberOfOperations = 10000;
        int[] testData = new int[numberOfOperations];
        for (int i = 0; i < numberOfOperations; i++) {
            testData[i] = i;
        }

        long originalStartTime = System.nanoTime();
        for (int data : testData) {
            originalImplementation.writeData(data);
        }
        long originalEndTime = System.nanoTime();
        long originalDuration = originalEndTime - originalStartTime;

        long fastStartTime = System.nanoTime();
        for (int data : testData) {
            fastImplementation.writeData(data);
        }
        long fastEndTime = System.nanoTime();
        long fastDuration = fastEndTime - fastStartTime;

        System.out.println("Original implementation duration: " + originalDuration + " ns");
        System.out.println("Fast implementation duration: " + fastDuration + " ns");

        try (java.io.FileWriter writer = new java.io.FileWriter("benchmark_results.txt", true)) {
            writer.write("Original implementation duration: " + originalDuration + " ns\n");
            writer.write("Fast implementation duration: " + fastDuration + " ns\n");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        assertTrue(fastDuration <= originalDuration * 0.9,
                "Fast implementation is not at least 10% faster than the original implementation");
    }
}
