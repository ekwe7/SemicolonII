import java.util.Scanner;
public class LeapYear{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter year ");
	int year = scanner.nextInt();
	
	boolean isYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	
	System.out.print(year + " is leap year " +isYear);


}
}