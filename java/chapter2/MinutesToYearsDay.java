import java.util.Scanner;

public class MinutesToYearsDay{
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        long minutesPerYear = 60 * 24 * 365;
        long minutesPerDay = 60 * 24;

        long years = minutes / minutesPerYear;
        long remainingMinutes = minutes % minutesPerYear;
        long days = remainingMinutes / minutesPerDay;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}