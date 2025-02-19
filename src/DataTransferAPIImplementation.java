import java.util.List;
import API_Package.*;
public class DataTransferAPIImplementation  implements DataTransferAPI{

        private final NetworkAPIImplementation networkAPI;
        private final int bufferSize;
    
        public DataTransferAPIImplementation(NetworkAPIImplementation networkAPI) {
            this.networkAPI = networkAPI;
            this.bufferSize = 1024; 
        }
    public void transferData(String source, String destination, String delimiter){

    }

    void convertDecimalToHex(int decimal, String destination){

    }
    public void sendData(List<String> list){

    }

}
