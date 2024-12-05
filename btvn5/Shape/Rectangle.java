package btvn5.Shape;

public class Rectangle extends ShapeService {
    protected double length;
    protected double width;

    public Rectangle() {

    }



    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Chieu dai: " + length + "\t" + "Chieu dong: " +width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calcArea() {
        return length * width;
    }

    public double calcPerimeter() {
        return 2 * (length + width);
    }
}
