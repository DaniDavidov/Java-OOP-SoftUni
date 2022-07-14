package T02EncapsulationExercises.E03ShoppingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public void buyProduct(Product product) {
        if (money < product.getCost()) {
            throw new IllegalArgumentException(String.format("%s can't afford %s%n", name, product.getName()));
        } else {
            products.add(product);
            this.setMoney(this.getMoney() - product.getCost());
            System.out.println(name + " bought " + product.getName());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            sb.append(products.get(i).getName());
            if (i < products.size() - 1) {
                sb.append(", ");
            }
        }
        return String.format("%s - %s", name, sb.toString());
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
