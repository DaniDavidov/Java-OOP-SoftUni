package T05PolymorphismExercises.E02WildFarm;

public abstract class Food {
    Integer quantity;

    public Food(Integer quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
