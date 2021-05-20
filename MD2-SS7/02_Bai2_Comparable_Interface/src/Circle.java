public class Circle extends Shape {
    double radius;
    private static final double PI  = 3.14;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(this.getRadius(),2)*PI;
    }
    public double getPerimeter(){
        return 2*PI*this.getRadius();
    }
    @Override
    public String toString() {
        String str =
                "A circle with radius "
                        + this.getRadius()
                        + " which is subclass of "
                        + super.toString();
        return str;
    }
}