import java.util.Scanner;

public class PopulationEstimator{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the current world population: ");
long currentPopulation = scanner.nextLong();

System.out.println("Enter the annual population growth rate: ");
 double growthRate = scanner.nextDouble();

long population1 = (long) (currentPopulation * (1 + growthRate / 100));
long population2 = (long) (currentPopulation * (1 + growthRate / 100));
long population3 = (long) (currentPopulation * (1 + growthRate / 100));
long population4 = (long) (currentPopulation * (1 + growthRate / 100));
long population5 = (long) (currentPopulation * (1 + growthRate / 100));

System.out.println("Estimated population after year 1: " + population1);
System.out.println("Estimated population after year 2: " + population2);
System.out.println("Estimated population after year 3: " + population3);
System.out.println("Estimated population after year 4: " + population4);
  System.out.println("Estimated population after year 5: " + population5);

    }
}



