import java.util.*;
import API_Package.DataStorageAPI;
public class DataStorageComponentAssign4 implements DataStorageAPI{
    TreeMap<Integer, Integer> intStorage;
    private static final Computation computation = new Computation();
    TreeMap<String, Integer> stringStorage;
    public  DataStorageComponentAssign4(){
        intStorage = new TreeMap<>();
        stringStorage = new TreeMap<>();
    }


    @Override
    public void readData() throws NullPointerException {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        String output = computation.convertToHexString(data);
        try {
            if (intStorage.containsKey(data)) {
                System.out.println(data + " is present in the storage " + intStorage.get(data) + " times");
            }
                if (stringStorage.containsKey(output)) {
                    System.out.println(data + " is present in the storage " + intStorage.get(data) + " times");
                }
        }catch(NullPointerException e){
            System.out.println(data + " isn't in storage.");
        }
    }


    @Override
    public void writeData() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        String output = computation.convertToHexString(data);
        if(intStorage.containsKey(data)){
            intStorage.replace(data,intStorage.get(data)+1);
        }else{
            intStorage.put(data,1);
        }
        if(stringStorage.containsKey(output)){
            stringStorage.replace(output,stringStorage.get(output)+1);
        }else{
            stringStorage.put(output,1);
        }
    }
    public void writeData(int data) {
        String output = computation.convertToHexString(data);
        if(intStorage.containsKey(data)){
            intStorage.replace(data,intStorage.get(data)+1);
        }else{
            intStorage.put(data,1);
        }

        if(stringStorage.containsKey(output)){
            stringStorage.replace(output,stringStorage.get(output)+1);
        }else{
            stringStorage.put(output,1);
        }
    }

    public void processData() {
        DataStorageAPI.super.processData();
    }
}
