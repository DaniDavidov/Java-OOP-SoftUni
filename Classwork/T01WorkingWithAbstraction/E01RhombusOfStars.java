package T01WorkingWithAbstraction;

import java.util.Scanner;

public class E01RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        for (int starCount = 1; starCount <= size; starCount++) {
            for (int j = 0; j < size - starCount; j++) {
                System.out.println(" ");
            }
            System.out.println("*");
        }

        for (int i = size - 1; i > 0; i++) {

        }
    }
}
