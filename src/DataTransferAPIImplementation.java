<<<<<<< Updated upstream
=======
<<<<<<< HEAD
import API_Package.DataTransferAPI;
>>>>>>> Stashed changes
import java.util.List;
import API_Package .*;
public class DataTransferAPIImplementation implements DataTransferAPI{
    public DataTransferAPIImplementation {

        final NetworkAPIImplementation networkAPI;
        final int bufferSize;

<<<<<<< Updated upstream
=======
=======
import java.util.List;
import API_Package .*;
public class DataTransferAPIImplementation implements DataTransferAPI{
    public DataTransferAPIImplementation {

        final NetworkAPIImplementation networkAPI;
        final int bufferSize;

>>>>>>> Stashed changes
        public DataTransferAPIImplementation(NetworkAPIImplementation networkAPI) {
            this.networkAPI = networkAPI;
            this.bufferSize = 1024;
        }
<<<<<<< Updated upstream
=======
>>>>>>> origin/main
>>>>>>> Stashed changes

        public void transferData(String source, String destination, String delimiter) {

        }

<<<<<<< Updated upstream
        void convertDecimalToHex(int decimal, String destination) {
=======
<<<<<<< HEAD
        public void convertDecimalToHex(int decimal, String destination) {
=======
        void convertDecimalToHex(int decimal, String destination) {
>>>>>>> origin/main
>>>>>>> Stashed changes

        }

        public void sendData(List<String> list) {

        }

    }

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
=======
>>>>>>> Stashed changes
    @Override
    public void transferData(String source, String destination, String delimiter) {

    }

    @Override
    public void convertDecimalToHex(int decimal, String destination) {

    }
}
<<<<<<< Updated upstream
=======
>>>>>>> origin/main
>>>>>>> Stashed changes
