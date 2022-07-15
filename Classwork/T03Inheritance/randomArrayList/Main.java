package T03Inheritance.randomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList randomArrayList = new RandomArrayList();
        randomArrayList.add("Dani");
        randomArrayList.add("Kiki");
        randomArrayList.add("Niki");

        Object object = randomArrayList.getRandomElement();

    }
}
