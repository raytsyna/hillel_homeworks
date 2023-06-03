package homework9_Shapes;

public class Main {
    public static void main(String[] args) {

        //Double
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.718");

        String stringValue = "1.234";
        double doubleValue = Double.parseDouble(stringValue);

        double primitiveDouble = doubleObj1.doubleValue();
        float primitiveFloat = doubleObj1.floatValue();
        int primitiveInt = doubleObj1.intValue();
        long primitiveLong = doubleObj1.longValue();
        short primitiveShort = doubleObj1.shortValue();
        byte primitiveByte = doubleObj1.byteValue();

        System.out.println("The value of the doubleObj1: " + doubleObj1);

        String doubleLiteral = Double.toString(3.14);
        System.out.println("A string resulting from a double literal: " + doubleLiteral);

        System.out.println();

        //Shape
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(Color.RED, 0, 0, 5.0);
        shapes[1] = new Rectangle(Color.GREEN, 0, 0, 3.0, 4.0);
        shapes[2] = new Triangle(Color.BLUE, 0, 0, 3.0, 0, 0, 4.0);

        for (Shape shape : shapes) {
            shape.paint();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}



