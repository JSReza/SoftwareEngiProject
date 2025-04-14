package client;
import java.util.*;
import java.io.*;
import API_Package.NetworkAPI;
import API_Package.DataTransferPrototype
private static final Computation computation = new Computation();
    //GRPC implementation goes here
    Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers, type 'done' to finish:");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else {
                String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Invalid input: " + input + ". Please enter a number or 'done'.");
                }
            }
            Iterator <Integer> iterator = numbers.iterator();
            HashMap<Integer, Character> hm = new HashMap<>();
            while (iterator.hasNext()){
                int number = iterator.next();
                char hex = computation.toHex(number);
                hm.put(number, hex);
            }
            if(hm.isEmpty()){
                System.out.println("No numbers were entered.");
            } else {
                System.out.println("The hex values are: ");
                for (Map.Entry<Integer, Character> entry : hm.entrySet()) {
                    System.out.println("Decimal: " + entry.getKey() + " Hex: " + entry.getValue());
                }
            }
            }
        }
    