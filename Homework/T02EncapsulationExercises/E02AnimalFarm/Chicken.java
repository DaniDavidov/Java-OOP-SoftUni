package T02EncapsulationExercises.E02AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (age >= 0 && age < 6) {
            return 2;
        } else if (age < 12) {
            return 1;
        }
        return 0.75;
    }

    @Override
    public String toString() {
        return String.format("Chicken Chichi (age %d) can produce %.2f eggs per day.",
                this.getAge(), this.productPerDay());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 1) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age >= 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }
}
