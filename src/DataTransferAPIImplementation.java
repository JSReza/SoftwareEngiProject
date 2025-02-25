<<<<<<< Updated upstream

=======
<<<<<<< HEAD
>>>>>>> Stashed changes
import API_Package.DataTransferAPI;

import java.util.List;
import API_Package .*;
public class DataTransferAPIImplementation implements DataTransferAPI{
        final NetworkAPIImplementation networkAPI;
        final int bufferSize;
   public DataTransferAPIImplementation(NetworkAPIImplementation networkAPI) {
       this.networkAPI = networkAPI;
       this.bufferSize = 1024;
   }
   public void transferData(String source, String destination, String delimiter){

       }
    public void convertDecimalToHex(int decimal, String destination) {

       }

<<<<<<< Updated upstream
    public void sendData(List<String> list) {

    }

}
=======

=======
import java.util.List;
import API_Package .*;
public class DataTransferAPIImplementation implements DataTransferAPI{
    public DataTransferAPIImplementation {

        final NetworkAPIImplementation networkAPI;
        final int bufferSize;

        public DataTransferAPIImplementation(NetworkAPIImplementation networkAPI) {
            this.networkAPI = networkAPI;
            this.bufferSize = 1024;
        }
>>>>>>> origin/main

        public void transferData(String source, String destination, String delimiter) {

        }

<<<<<<< HEAD
        public void convertDecimalToHex(int decimal, String destination) {
=======
        void convertDecimalToHex(int decimal, String destination) {
>>>>>>> origin/main

        }

        public void sendData(List<String> list) {

        }

    }

<<<<<<< HEAD
=======
    @Override
    public void transferData(String source, String destination, String delimiter) {

    }

    @Override
    public void convertDecimalToHex(int decimal, String destination) {

    }
}
>>>>>>> origin/main
>>>>>>> Stashed changes
