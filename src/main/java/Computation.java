public class Computation {
    private char getHexDigit(int digit) {
        if (digit < 10) {
            return (char) ('0' + digit);
        } else {
            return (char) ('A' + (digit - 10));
        }
    }

    public String convertToHexString(int input) {
        long startTime = System.nanoTime(); // Start timing
        if (input == 0) {
            return "0";
        }
        StringBuilder hex = new StringBuilder();
        while (input > 0) {
            int modulo = input % 16;
            hex.insert(0, getHexDigit(modulo));
            input = input / 16;
        }
        long endTime = System.nanoTime(); // End timing
        System.out.println("convertToHexString execution time: " + (endTime - startTime) + " ns");

        return hex.toString().toUpperCase();
    }

    public String convertDelimitedIntegersToHex(String delimitedInput) {
        String[] integers = delimitedInput.split(",");
        StringBuilder hexResults = new StringBuilder();
        for (int i = 0; i < integers.length; i++) {
            try {
                int number = Integer.parseInt(integers[i].trim());
                hexResults.append(convertToHexString(number));
            } catch (NumberFormatException e) {
                hexResults.append("Invalid");
            }
            if (i < integers.length - 1) {
                hexResults.append(",");
            }
        }
        return hexResults.toString();
    }
}
