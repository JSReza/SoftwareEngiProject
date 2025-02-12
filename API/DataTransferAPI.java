@NetworkAPI
public interface DataTransferAPI {
    void transferData(String source, String destination, String delimiter);

    void convertDecimalToHex(int decimal, String destination);
}