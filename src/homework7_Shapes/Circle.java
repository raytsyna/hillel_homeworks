package homework7_Shapes;

import java.util.Objects;

class Circle extends Shape {
    private double radius;
    private double x;
    private double y;


    public Circle(double radius, double x, double y, String color) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.color = color;

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void paint() {
        System.out.println("This is a circle with radius " + radius + ", centered at (" + x + ", " + y + "), color: " + color);
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + ", x=" + x + ", y=" + y + ", color='" + color + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return Objects.equals(radius, ((Circle) o).radius);
    }


}




