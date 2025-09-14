/*
1.prompt user for input values for hours and rate
2. Check if the hours are less than or equal to 40
3. If true, calculate the total pay as hours * rate
4. If false, calculate the overtime hours and total pay with overtime
5. Print the total pay.
*/


import java.util.Scanner;

public class PayCalculator{
public static void main(String[] args){

 Scanner scanner = new Scanner(System.in);

System.out.print("Enter the number of hours worked: ");
double hours = scanner.nextDouble();

 System.out.print("Enter the hourly rate: ");
double rate = scanner.nextDouble();

 double totalPay;
if(hours <= 40){
totalPay = hours * rate;
}else{
double overtimeHours = hours - 40;
totalPay = (40 * rate) + (overtimeHours * rate * 1.5);
}

System.out.printf("Total pay: $%.2f%n", totalPay);

}

}