package test.java;

import java.io.File;

// Assuming NetworkAPI and ComputationCoordinator are part of the same package or imported
import main.java.CoordinationComponent;
import main.java.Computation;

public class TestUser {

	private CoordinationComponent coordinator = new CoordinationComponent();
	private Computation computation = new Computation();

	public TestUser(CoordinationComponent coordinator) {
		this.coordinator = coordinator;
	}

	public void run(String outputPath) {
		char delimiter = ',';
		String input = "test" + File.separatorChar + "testInputFile.test";

		// Assuming the input is a delimited string of integers
		String[] numbers = input.split(String.valueOf(delimiter));
		int[] intNumbers = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			intNumbers[i] = Integer.parseInt(numbers[i].trim());
		}

		// Call the convertDelimitedIntegersToHex method on the Computation class
		String delimitedNumbers = java.util.Arrays.stream(intNumbers)
				.mapToObj(String::valueOf)
				.collect(java.util.stream.Collectors.joining(String.valueOf(delimiter)));
		String hexResult = computation.convertDelimitedIntegersToHex(delimitedNumbers);

		// Write the result to the output path (assuming a utility method for file
		// writing)
		try {
			java.nio.file.Files.writeString(java.nio.file.Path.of(outputPath), hexResult);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}
}
