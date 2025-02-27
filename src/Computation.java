
public class Computation {
    private static final int MAX_VALUE  = Integer.MAX_VALUE;;
    private static final int MIN_VALUE = 0;
    
    public boolean validateInput(int decimal) {
        return decimal >= MIN_VALUE && decimal <= MAX_VALUE;
    }
    private char getHexDigit(int digit) {
        if (digit < 10) {
            return (char) ('0' + digit);
        } else {
            return (char) ('A' + (digit - 10));
        }
    }

    public String convertToHexString(int decimal) {
        if (decimal == 0) {
            return "0";
        }  
        StringBuilder hexBuilder = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexBuilder.insert(0, getHexDigit(remainder));
            decimal = decimal / 16;
        }
        
        return hexBuilder.toString().toUpperCase();
    }
    

    
}
