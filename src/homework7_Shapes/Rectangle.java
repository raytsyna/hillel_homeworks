package homework7_Shapes;
class Rectangle extends Shape {
    private double width;
    private double height;
    private double x;
    private double y;

    public Rectangle(double width, double height, double x, double y, String color) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color = color;
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
        System.out.println("This is a rectangle with width " + width + ", height " + height + ", top-left corner at (" + x + ", " + y + "), color: " + color);
    }

}