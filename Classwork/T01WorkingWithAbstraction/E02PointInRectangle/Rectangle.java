package T01WorkingWithAbstraction.E02PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        boolean isInXBound = point.getX() >= bottomLeft.getX()
                && point.getX() <= topRight.getX();
        boolean isInYBound = point.getY() >= bottomLeft.getY()
                && point.getY() <= topRight.getY();

        return isInXBound && isInYBound;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }
}
