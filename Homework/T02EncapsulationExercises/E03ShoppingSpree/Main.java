package T02EncapsulationExercises.E03ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        String[] peopleData = scanner.nextLine().split(";");
        String[] productsData = scanner.nextLine().split(";");

        for (String data : peopleData) {
            String[] personData = data.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);
            Person person = new Person(name, money);
            people.putIfAbsent(person.getName(), person);
        }
        for (String data : productsData) {
            String[] productData = data.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);
            Product product = new Product(name, cost);
            products.putIfAbsent(product.getName(), product);
        }

        String line;
        while (!"END".equals(line = scanner.nextLine())) {
            String[] data = line.split("\\s+");
            String personName = data[0];
            String productName = data[1];

            Person person = people.get(personName);
            Product product = products.get(productName);
            person.buyProduct(product);
        }

        people.forEach((name, person) -> {
            if (person.getProducts().size() > 0) {
                System.out.println(person.toString());
            } else {
                System.out.printf("%s - Nothing bought", name);
            }
        });
    }
}
