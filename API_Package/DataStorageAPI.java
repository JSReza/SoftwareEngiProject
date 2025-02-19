package API_Package;
public interface DataStorageAPI {


    void readData();

    void writeData();

    default void processData() {
        // Prototype method implementation
        readData();
        writeData();
    }
}
 