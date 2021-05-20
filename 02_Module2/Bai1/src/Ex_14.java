import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double inputWidth = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double inputHeight = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(inputWidth, inputHeight);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}

