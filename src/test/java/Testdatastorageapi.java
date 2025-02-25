package test.java;

import java.util.List;
import API_Package.DataStorageAPI;
public class TestDataStorageAPI implements DataStorageAPI{
    private final TestInputConfig inputConfig;
    private final TestOutputConfig outputConfig;

    public TestDataStorageAPI(TestInputConfig inputConfig, TestOutputConfig outputConfig) {
        this.inputConfig = inputConfig;
        this.outputConfig = outputConfig;
    }

    public void writeData() {
        List<String> outputs = outputConfig.getOutputData();
 
        for (String output : outputs) {
            System.out.println(output);
        }
        }
    
        public void readData(){
            List<Integer> inputs = inputConfig.getInputData();
            for (Integer value : inputs) {
                String processed = String.valueOf(value);
                outputConfig.writeOutput(processed);
            }
        }
    }

