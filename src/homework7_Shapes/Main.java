package homework7_Shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5.0, 0.0, 5.0, "Red");
        shapes[1] = new Rectangle(4.0, 6.0, 1.0, 2.0, "Blue");
        shapes[2] = new Triangle(3.0, 4.0, 5.0, 0.0, 0.0, 3.0, 0.0, 0.0, 4.0, "Green");

        for (Shape shape : shapes) {
            shape.paint();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("Equals: " + shape.equals(shape));
            System.out.println("Hash Code: " + shape.hashCode());
            System.out.println("ToString: " + shape.toString());
            System.out.println();
        }
    }
}