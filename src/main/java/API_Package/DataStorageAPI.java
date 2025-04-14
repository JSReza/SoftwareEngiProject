
package API_Package;

public interface DataStorageAPI {
    void readData();

    void writeData();

    @ProcessAPIPrototype
    default void processData() {
        // Prototype method implementation
        readData();
        writeData();
    }
}