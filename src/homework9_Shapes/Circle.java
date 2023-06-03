package homework9_Shapes;

class Circle extends Shape {
    private double centerX;
    private double centerY;
    private double radius;

    public Circle(Color color, double centerX, double centerY, double radius) {
        super(color);
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
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
        System.out.println("Painting a circle with color: " + color);
    }
    @Override
    public String toString() {
        return "Circle{" +
                "centerX=" + centerX +
                ", centerY=" + centerY +
                ", radius=" + radius +
                ", color=" + color +
                '}';
    }
}




