package homework9_Shapes;

import java.util.Objects;

public abstract class Shape {
    public Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Shape() {

    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract void paint();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
