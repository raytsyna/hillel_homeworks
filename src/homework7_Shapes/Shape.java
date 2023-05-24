package homework7_Shapes;

import java.util.Objects;

abstract class Shape {
    public String color;
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract void paint();

    @Override
    public String toString() {
        return "Shape{color='" + color + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Shape other = (Shape) obj;
        return Objects.equals(color, other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
