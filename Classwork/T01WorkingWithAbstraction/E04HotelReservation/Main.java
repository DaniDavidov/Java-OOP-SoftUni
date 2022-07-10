package T01WorkingWithAbstraction.E04HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(data[0]);
        int numberOfDays = Integer.parseInt(data[1]);
        String season = data[2];
        String discountType = data[3];

        double price = PriceCalculator.calculateTotalPrice(pricePerDay, numberOfDays,
                Season.valueOf(season), DiscountType.valueOf(discountType));
        System.out.printf("%.2f", price);
    }
}
