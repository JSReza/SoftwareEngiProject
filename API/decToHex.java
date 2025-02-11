import java.util.Scanner;

public class decToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive whole decimal integer: ");
        int decimal = scanner.nextInt();
        scanner.close();

        if (decimal < 0) {
            System.out.println("Please enter a positive whole decimal integer.");
            return;
        }

        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal representation: " + hex);
    }
}
