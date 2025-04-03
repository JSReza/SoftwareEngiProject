package main.java;

import API_Package.DataStorageAPI;

public class DataStorageAPIImplementation implements DataStorageAPI {
    private final String storageLocation;
    private boolean isInitialized;

    public DataStorageAPIImplementation(String storageLocation) {
        this.storageLocation = storageLocation;
        this.isInitialized = false;
    }

    public void readData() {
        System.out.println("Reading data from " + storageLocation);

    }

    public void writeData() {

    }

    public void processData() {

    }
}
