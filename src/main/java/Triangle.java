public class Triangle extends Shape {

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
    }

    public double getArea(){
        return side1 + side2 + side3;
    }

    public double getPerimeter() {
        return Math.sqrt(getArea() * (side1 + side2 - side3) * (side2 + side3 - side1) * (side3 + side1 - side2)) / 4;
    }

    @Override
    public String toString() {
        return "color: " + color + "\n" + "dien tich: " + getPerimeter() + "\n" + "chu vi: " + getArea();
    }
}
