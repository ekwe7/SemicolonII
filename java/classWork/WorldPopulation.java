import java.util.Scanner;

public class WorldPopulation{
public static void main(String...ekwe){

Scanner input = new Scanner(System.in);

System.out.print("Enter world population: ");
double population = input.nextDouble();

System.out.print("Enter the growth rate: ");
double growthRate = input.nextDouble();

int NumberOfYears = 75;

for(int counter = 1; counter <= NumberOfYears; counter++){

double currentPopulation = population * Math.pow(1 + growthRate, counter -1);
double increaseRate = currentPopulation * growthRate;



}
System.out.printf(counter +" "+ currentPopulation +" "+ increaseRate);


}
}