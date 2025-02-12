
public interface decToHex {
    public static void main(String[] args) {

        if (decimal < 0) {
            System.out.println("Please enter a positive whole decimal integer.");
            return;
        }

        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal representation: " + hex);
    }
}
