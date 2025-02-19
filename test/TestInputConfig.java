import java.util.*;
public class TestInputConfig{
    private List<Integer> inputData;

    public TestInputConfig() {
        this.inputData = new ArrayList<>();
    }

    public void addTestData(int numbers) {
        inputData.addAll(Arrays.asList(numbers));
    }

    public List<Integer> getInputData() {
        return inputData;
    }

    public void clearData() {
        inputData.clear();
    }
}