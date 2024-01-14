package Lab01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the inner circle:");
        double ri = scanner.nextDouble();
        System.out.println("Enter the radius of the outer circle:");
        double ro = scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double area = outerCircle.computeArea() - innerCircle.computeArea();
        System.out.println("The area of the circular region is " + area);
    }
}
