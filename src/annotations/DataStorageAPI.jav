<<<<<<< HEAD:src/annotations/DataStorageAPI.jav
package annotations;
=======
>>>>>>> JRSecondBranch:API/datastorageapi.java

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