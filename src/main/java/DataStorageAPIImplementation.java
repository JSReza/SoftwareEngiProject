
import java.util.*;
import API_Package.DataStorageAPI;

public class DataStorageAPIImplementation implements DataStorageAPI {
    TreeMap<Integer, Integer> intStorage;
    private static final Computation computation = new Computation();
    TreeMap<String, Integer> stringStorage;

    public DataStorageAPIImplementation() {
        intStorage = new TreeMap<>();
        stringStorage = new TreeMap<>();
    }

    @Override
    public void readData() {
        try (Scanner s = new Scanner(System.in)) {
            int data = s.nextInt();
            String output = computation.convertToHexString(data);
            if (intStorage.containsKey(data)) {
                System.out.println(data + " is present in the storage " + intStorage.get(data) + " times");
            } else {
                System.out.println("cannot find number in storage");
            }
            if (stringStorage.containsKey(output)) {
                System.out.println(data + " is present in the storage " + intStorage.get(data) + " times");
            } else {
                System.out.println("cannot find hex in storage");
            }
        }
    }

    @Override
    public void writeData() {
        try (Scanner s = new Scanner(System.in)) {
            int data = s.nextInt();
            String output = computation.convertToHexString(data);
            if (intStorage.containsKey(data)) {
                intStorage.replace(data, intStorage.get(data) + 1);
            } else {
                intStorage.put(data, 1);
            }
            if (stringStorage.containsKey(output)) {
                stringStorage.replace(output, stringStorage.get(output) + 1);
            } else {
                stringStorage.put(output, 1);
            }
        }
    }

    public void writeData(int data) {
        String output = computation.convertToHexString(data);
        if (intStorage.containsKey(data)) {
            intStorage.replace(data, intStorage.get(data) + 1);
        } else {
            intStorage.put(data, 1);
        }

        if (stringStorage.containsKey(output)) {
            stringStorage.replace(output, stringStorage.get(output) + 1);
        } else {
            stringStorage.put(output, 1);
        }
    }

    public void processData() {
        DataStorageAPI.super.processData();
    }
}

