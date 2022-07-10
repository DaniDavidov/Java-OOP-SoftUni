package T01WorkingWithAbstraction.E03StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();
        String[] input = scanner.nextLine().split(" ");
        while (input[0].equals("Exit")) {
            studentSystem.ExecuteCommand(input);
            input = scanner.nextLine().split(" ");
        }
    }
}
