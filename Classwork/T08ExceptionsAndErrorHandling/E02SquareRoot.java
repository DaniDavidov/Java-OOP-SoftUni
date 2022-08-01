package T08ExceptionsAndErrorHandling;

import java.util.Scanner;

public class E02SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int input = Integer.parseInt(scanner.nextLine());
            if (input > 0) {
                double squareRoot = Math.sqrt(input);
                System.out.printf("%.2f%n", squareRoot);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
