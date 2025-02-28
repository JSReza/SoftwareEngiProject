
public class Computation {
    private char getHexDigit(int digit) {
        if (digit < 10) {
            return (char) ('0' + digit);
        } else {
            return (char) ('A' + (digit - 10));
        }
    }

    public String convertToHexString(int input) {
        if (input == 0) {
            return "0";
        }  
        StringBuilder hex = new StringBuilder();
        while (input > 0) {
            int modulo = input % 16;
            hex.insert(0, getHexDigit(modulo));
            input = input/16;
        }
        
        return hex.toString().toUpperCase();
    }
    

    
}
