package T01WorkingWithAbstraction.E02PointInRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rectangleCoordinates = scanner.nextLine().split(" ");
        int bottomLeftX = Integer.parseInt(rectangleCoordinates[0]);
        int bottomLeftY = Integer.parseInt(rectangleCoordinates[1]);
        Point bottomLeft = new Point(bottomLeftX, bottomLeftY);

        int topRightX = Integer.parseInt(rectangleCoordinates[2]);
        int topRightY = Integer.parseInt(rectangleCoordinates[3]);
        Point topRight = new Point(topRightX, topRightY);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[1]);

            Point point = new Point(x, y);
            System.out.println(rectangle.contains(point));
        }
    }
}
