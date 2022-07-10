package T01WorkingWithAbsrtractionExercise.E04TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Light> lights = new ArrayList<>();

        String[] data = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        for (String color : data) {
            Light light = new Light(Color.valueOf(color));
            lights.add(light);
        }

        for (int i = 0; i < n; i++) {
            lights.forEach(light -> {
                light.changeColor();
                System.out.print(light.getColor() + " ");
            });
            System.out.println();
        }
    }
}
