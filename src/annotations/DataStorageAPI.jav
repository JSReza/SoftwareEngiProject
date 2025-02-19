package annotations;

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