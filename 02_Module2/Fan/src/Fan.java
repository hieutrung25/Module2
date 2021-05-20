public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        String str;
        if (this.on)
            str = "Speed: " + getSpeed() + "\n" + "Color: " + this.color + "\n" + "Radius: " + getRadius() + "\n" + "Fan is on" + "\n";

        else {
            str = "Speed: " + getSpeed() + "\n" + "Color: " + this.color + "\n" + "Radius: " + getRadius() + "\n" + "Fan is off" + "\n";
        }
        return str;
    }

}
class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
