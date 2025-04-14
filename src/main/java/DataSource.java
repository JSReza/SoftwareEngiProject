
public class DataSource {
    private String data;

    public DataSource(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public String fetchData() {
        return "Sample Data";
    }
}
