import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import API_Package.DataStorageAPI;

public class FastDataStorageAPIImplementation implements DataStorageAPI {
    private final Map<Integer, Integer> intStorage;
    private final Map<String, Integer> stringStorage;
    private static final Computation computation = new Computation();

    public FastDataStorageAPIImplementation() {
        intStorage = new HashMap<>();
        stringStorage = new HashMap<>();
    }

    @Override
    public void readData() {
        try (Scanner s = new Scanner(System.in)) {
            if (s.hasNextInt()) {
                int data = s.nextInt();
                String output = computation.convertToHexString(data);
                if (intStorage.containsKey(data)) {
                    System.out.println(data + " is present in the storage " + intStorage.get(data) + " times");
                } else {
                    System.out.println("cannot find number in storage");
                }
                if (stringStorage.containsKey(output)) {
                    System.out.println(data + " is present in the storage " + stringStorage.get(output) + " times");
                } else {
                    System.out.println("cannot find hex in storage");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    @Override
    public void writeData() {
        try (Scanner s = new Scanner(System.in)) {
            if (s.hasNextInt()) {
                int data = s.nextInt();
                String output = computation.convertToHexString(data);
                intStorage.put(data, intStorage.getOrDefault(data, 0) + 1);
                stringStorage.put(output, stringStorage.getOrDefault(output, 0) + 1);
            } else {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    public void writeData(int data) {
        long startTime = System.nanoTime(); // Start timing
        String output = computation.convertToHexString(data);
        intStorage.put(data, intStorage.getOrDefault(data, 0) + 1);
        stringStorage.put(output, stringStorage.getOrDefault(output, 0) + 1);
        long endTime = System.nanoTime(); // End timing
        System.out.println("writeData execution time: " + (endTime - startTime) + " ns");
    }

    @Override
    public void processData() {
        DataStorageAPI.super.processData();
    }
}
