package T05Polymorphism.E02Shapes;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        this.setPerimeter(2 * Math.PI * radius);
    }

    @Override
    public void calculateArea() {
        this.setArea(Math.PI * Math.pow(radius, 2));
    }

    public final Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
