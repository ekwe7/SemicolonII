import java.util.Scanner;

public class AreaOfHaxagon {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the side of the hexagon: ");
double side = input.nextDouble();

double sqrt3 = 1.732;
double area = (3 * sqrt3 / 2) * side * side;

System.out.printf("The area of the hexagon is %.2f\n", area);

}
}