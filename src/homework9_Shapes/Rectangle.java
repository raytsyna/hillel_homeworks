package homework9_Shapes;
class Rectangle extends Shape {
    private double width;
    private double height;
    private double x;
    private double y;

    public Rectangle(Color color, double x, double y, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void paint() {
        System.out.println("Painting a rectangle with color: " + color);
    }

    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", " + "height=" + height + ", " + "color='" + color + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Rectangle other = (Rectangle) obj;
        return width == other.width &&
                height == other.height;

    }
}