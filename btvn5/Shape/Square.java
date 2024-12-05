package btvn5.Shape;

public class Square extends ShapeService {
    protected double side;
    public Square () {

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Canh: "+side;
    }

    public double calcPerimeter() {
        return 4 * side;
    }

    public double calcArea() {
        return side * side;
    }
}
