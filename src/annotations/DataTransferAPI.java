<<<<<<< HEAD:src/annotations/DataTransferAPI.java
package annotations;
=======
>>>>>>> JRSecondBranch:API/DataTransferAPI.java

@NetworkAPI
public interface DataTransferAPI {
    void transferData(String source, String destination, String delimiter);

    void convertDecimalToHex(int decimal, String destination);
}