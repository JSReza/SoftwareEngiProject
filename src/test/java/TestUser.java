import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestUser {

	private CoordinationComponent coordinator = new CoordinationComponent();
	private Computation computation = new Computation();

	public void run(String outputPath) {
		char delimiter = ',';
		// Read the contents of the test input file
		String inputFilePath = "src/test/java/testInputFile.test";
		String input = "";
		try {
			input = java.nio.file.Files.readString(java.nio.file.Path.of(inputFilePath)).trim();
		} catch (java.io.IOException e) {
			System.err.println("Failed to read input file: " + e.getMessage());
		}
		// Assuming the input is a delimited string of integers
		String[] numbers = input.split(String.valueOf(delimiter));
		int[] intNumbers = new int[numbers.length];

		// Add input validation to handle invalid data
		for (int i = 0; i < numbers.length; i++) {
			try {
				intNumbers[i] = Integer.parseInt(numbers[i].trim());
			} catch (NumberFormatException e) {
				System.err.println("Invalid number format: " + numbers[i]);
				intNumbers[i] = 0; // Default value or skip processing
			}
		}

		// Call the convertDelimitedIntegersToHex method on the Computation class
		String delimitedNumbers = java.util.Arrays.stream(intNumbers)
				.mapToObj(String::valueOf)
				.collect(java.util.stream.Collectors.joining(String.valueOf(delimiter)));
		String hexResult = computation.convertDelimitedIntegersToHex(delimitedNumbers);

		// Use the coordinator to perform an operation (example: logging or
		// coordination)
		coordinator.coordinate(hexResult);

		// Write the result to the output path (assuming a utility method for file
		// writing)
		try {
			java.nio.file.Files.writeString(java.nio.file.Path.of(outputPath), hexResult);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testRunWithValidInput() {
		String outputPath = "testOutput.txt";
		// Run the method (this will write to a file)
		run(outputPath);
		// Check that the output file was created and is not empty
		java.nio.file.Path path = java.nio.file.Path.of(outputPath);
		assertTrue(java.nio.file.Files.exists(path), "Output file should exist");
		try {
			String content = java.nio.file.Files.readString(path);
			assertNotNull(content);
			assertFalse(content.isEmpty(), "Output file should not be empty");
		} catch (java.io.IOException e) {
			fail("IOException occurred: " + e.getMessage());
		}
		// Clean up
		try {
			java.nio.file.Files.deleteIfExists(path);
		} catch (Exception ignored) {
		}
	}
}
