import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        System.out.println("Quadratic Equation");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a");
        double inputA = scanner.nextDouble();

        System.out.println("Insert b");
        double inputB = scanner.nextDouble();

        System.out.println("Insert c");
        double inputC = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(inputA,inputB,inputC);
        double outputDelta = equation.getDiscriminant();
        if (outputDelta > 0 )
            System.out.println("The equation has two roots " + equation.getRoot1() + " and " + equation.getRoot2());
        else if (outputDelta == 0)
            System.out.println("The equation has one root " + equation.getRoot1());
        else
            System.out.println("The equation has no roots");
    }
}

