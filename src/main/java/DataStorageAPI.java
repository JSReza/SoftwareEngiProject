package main.java;
import annotations.ProcessAPIPrototype;
import annotations.ProcessAPI;

public interface DataStorageAPI {
    @ProcessAPI
    void readData();

    @ProcessAPI
    void writeData();

    @ProcessAPIPrototype
    default void processData() {
        // Prototype method implementation
        readData();
        writeData();
    }
}