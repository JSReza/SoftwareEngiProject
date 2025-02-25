<<<<<<< Updated upstream
import API_Package.*;
public class DataStorageAPIImplementation  implements DataStorageAPI {
    private final String storageLocation;
    private boolean isInitialized;

    public DataStorageAPIImplementation(String storageLocation) {
=======
import API_Package.DataStorageAPI;
public class datastorageapiImplementation implements DataStorageAPI {
    private final String storageLocation;
    private boolean isInitialized;

    public datastorageapiImplementation(String storageLocation) {
>>>>>>> Stashed changes
        this.storageLocation = storageLocation;
        this.isInitialized = false;
    }
    public void readData(){

    }
    public void writeData(){

    }
    public void processData(){
        
    }
}
