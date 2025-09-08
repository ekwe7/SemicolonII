import java.util.Scanner;

public class PyramidEstimator{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("number of stones used: ");
 long stones = scanner.nextLong();

System.out.print("Enter average weight of each stone: ");
  double weightPerStone = scanner.nextDouble();

System.out.print("Enter number of years taken to build the pyramid: ");
  int years = scanner.nextInt();

 double totalWeight = stones * weightPerStone;

double weightPerYear = totalWeight / years;
double hoursPerYear = 365 * 24;
  double weightPerHour = weightPerYear / hoursPerYear;
double weightPerMinute = weightPerHour / 60;

System.out.printf("Total weight of pyramid: %.2f%n", totalWeight);
 System.out.printf("Weight built per year: %.2f%n", weightPerYear);
System.out.printf("Weight built per hour: %.4f%n", weightPerHour);
System.out.printf("Weight built per minute: %.6f%n", weightPerMinute);
    }
}
