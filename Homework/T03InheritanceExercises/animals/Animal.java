package T03InheritanceExercises.animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String produceSound() {
        return "sound";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + System.lineSeparator() +
                this.name + " " + age + " " + gender + System.lineSeparator() +
                this.produceSound();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if (gender.trim().isEmpty() || !gender.equals("Female") && !gender.equals("Male")) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }
}
