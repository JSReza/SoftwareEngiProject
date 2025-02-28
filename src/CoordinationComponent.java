import java.util.*;
public class CoordinationComponent {
    private static final DataStorageComponentAssign4 dataStorage = new DataStorageComponentAssign4();;
    private static final Computation computation = new Computation();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String output = computation.convertToHexString(input);
        dataStorage.writeData(input);
        System.out.println(input + "has been converted to hex and is now " + output);
    }


}