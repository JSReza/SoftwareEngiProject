package com.example.computeengine;

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
        return hex.toString();
    }

    public String convertDelimitedIntegersToHex(String delimitedIntegers) {
        String[] integers = delimitedIntegers.split(",");
        StringBuilder hexString = new StringBuilder();
        for (String integer : integers) {
            int value = Integer.parseInt(integer.trim());
            hexString.append(convertToHexString(value)).append(",");
        }
        // Remove the trailing comma
        if (hexString.length() > 0) {
            hexString.setLength(hexString.length() - 1);
        }
        return hexString.toString();
    }
}
