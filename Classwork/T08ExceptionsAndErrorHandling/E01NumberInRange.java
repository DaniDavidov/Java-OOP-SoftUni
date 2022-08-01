package T08ExceptionsAndErrorHandling;

import java.util.Scanner;

public class E01NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] range = scanner.nextLine().split("\\s+");
        int start = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);
        System.out.printf("Range: [%d...%d]%n", start, end);

        int number = readNumber(scanner, start, end);
        System.out.println("Valid number: " + number);

    }

    private static int readNumber(Scanner scanner, int rangeStart, int rangeEnd) {
        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number >= rangeStart && number <= rangeEnd) {
                    return number;
                } else {
                    throw new Exception("Invalid number: " + number);
                }
            } catch (Exception exception) {
                System.out.println("Invalid number: " + input);
            }

        }
    }
}
