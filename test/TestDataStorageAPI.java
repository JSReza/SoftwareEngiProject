
import API_Package.DataStorageAPI;


import java.util.*;
public class TestDataStorageAPI implements DataStorageAPI {

    TestInputConfig inputConfig;
    TestOutputConfig outputConfig;

    public TestDataStorageAPI(TestInputConfig inputConfig, TestOutputConfig outputConfig){
        this.inputConfig = inputConfig;
        this.outputConfig = outputConfig;
    }

    @Override
    public void readData() {

    }

    @Override
    public void writeData() {

    }
}
