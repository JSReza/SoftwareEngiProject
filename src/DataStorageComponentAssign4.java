import java.util.*;
import API_Package.DataStorageAPI;
public class DataStorageComponentAssign4 implements DataStorageAPI{
    HashMap<Integer, Integer> dataStorage;
    public  DataStorageComponentAssign4(){
        dataStorage = new HashMap<>();
    }

    @Override
    public void readData() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        if(dataStorage.containsKey(data)){
            System.out.println(data + " is present in the storage " + dataStorage.get(data) + " times");
        }else{
            return;
        }
    }

    @Override
    public void writeData() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        if(dataStorage.containsKey(data)){
            dataStorage.replace(data,dataStorage.get(data)+1);
        }else{
            dataStorage.put(data,1);
        }
    }
}
