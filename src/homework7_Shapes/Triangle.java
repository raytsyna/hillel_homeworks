package homework7_Shapes;

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    public Triangle(double side1, double side2, double side3, double x1, double y1, double x2, double y2, double x3, double y3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.color = color;
    }
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Rectangle{side1=" + side1 + ", " + "side2=" + side2 + ", " + "side3=" + side3 + ", " + "color='" + color + "'}";
    }
    @Override
    public void paint() {
        System.out.println("This is a triangle with sides " + side1 + ", " + side2 + ", " + side3 + ", vertices at (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + "), color: " + color);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Triangle other = (Triangle) obj;
        return this.side1 == other.side1 &&
                this.side2 == other.side2 &&
                this.side3 == other.side3;
    }
}