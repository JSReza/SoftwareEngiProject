<<<<<<< HEAD:src/main/interfaces/DataStorageAPI.java
<<<<<<< HEAD:src/main/interfaces/DataStorageAPI.java
package main.interfaces;
=======
>>>>>>> origin/JRSecondBranch:API/datastorageapi.java
=======
<<<<<<< HEAD:src/annotations/DataStorageAPI.jav
package annotations;
=======
>>>>>>> JRSecondBranch:API/datastorageapi.java
>>>>>>> origin/main:src/annotations/DataStorageAPI.jav

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