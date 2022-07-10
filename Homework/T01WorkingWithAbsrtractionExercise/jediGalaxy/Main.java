package T01WorkingWithAbsrtractionExercise.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // receiving the size of the matrix
            int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int rows = dimensions[0];
            int cols = dimensions[1];

            int[][] matrix = new int[rows][cols];
            // creating the matrix
            int value = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = value++;
                }
            }

            String command = scanner.nextLine();
            long sum = 0;
            while (!command.equals("Let the Force be with you"))
            {
                int[] heroCoordinates = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
                int[] evilCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int evilRow = evilCoordinates[0];
                int evilCol = evilCoordinates[1];

                moveEvil(matrix, evilRow, evilCol);

                int heroRow = heroCoordinates[0];
                int heroCol = heroCoordinates[1];

                sum = moveHero(matrix, heroRow, heroCol, sum);

                command = scanner.nextLine();
            }

        System.out.println(sum);


    }

    private static void moveEvil(int[][] matrix, int row, int col) {
        while (row >= 0 && col >= 0) {
            if (row < matrix.length && col < matrix[0].length) {
                matrix[row][col] = 0;
            }
            row--;
            col--;
        }
    }

    private static long moveHero(int[][] matrix, int heroRow, int heroCol, long sum) {
        while (heroRow >= 0 && heroCol < matrix[0].length) {
            if (heroRow <= matrix.length - 1 && heroCol >= 0) {
                sum += matrix[heroRow][heroCol];

            }
            heroRow--;
            heroCol++;
        }
        return sum;
    }
}
