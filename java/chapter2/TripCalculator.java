import java.util.Scanner;

public class TripCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance to drive (miles): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the fuel efficiency of the car (miles per gallon): ");
        double mpg = scanner.nextDouble();

        System.out.print("Enter the price per gallon of fuel: ");
        double pricePerGallon = scanner.nextDouble();

        if (mpg <= 0) {
            System.out.println("Fuel efficiency must be greater than zero.");
        } else {
            double gallonsNeeded = distance / mpg;
            double tripCost = gallonsNeeded * pricePerGallon;

            System.out.printf("The cost of the trip is $%.2f\n", tripCost);
        }

    }
}