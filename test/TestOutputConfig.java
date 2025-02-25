import java.util.*;
public class TestOutputConfig{
    private List<String> outputData;

    public TestOutputConfig() {
        this.outputData = new ArrayList<>();
    }

    public void writeOutput(String data) {
        outputData.add(data);
    }

    public List<String> getOutputData() {
        return outputData;
    }

    public void clearData() {
        outputData.clear();
    }
}