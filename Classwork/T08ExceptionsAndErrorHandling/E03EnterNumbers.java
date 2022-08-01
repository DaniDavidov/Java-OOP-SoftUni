package T08ExceptionsAndErrorHandling;

import java.util.Scanner;

public class E03EnterNumbers {
    public static int[] numbers = new int[10];
    public static int start = 1;
    public static int end = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        readNumber(scanner);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }

    private static void readNumber(Scanner scanner) {
        int i = 0;
        while (i < numbers.length) {
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                if (number <= start || number >= end) {
                    throw new IllegalArgumentException();
                }
                numbers[i] = number;
                start = numbers[i];
                i++;

            } catch (NumberFormatException e) {
                System.out.println("Invalid Number!");
            } catch (IllegalArgumentException exception) {
                System.out.printf("Your number is not in range %d - %d!%n", start, end);
            }
        }
    }
}
