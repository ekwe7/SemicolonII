import java.util.Scanner;

public class TempInCelcius{
public static void main(String []agrs){

Scanner input = new Scanner(System.in);

System.out.print("Enter Temp. in celcius: ");
int temp = input.nextInt();

if(temp < 0){
System.out.println("It's Freezing");
}else
if(temp >= 0 && temp <= 15){
System.out.println("It's Cold");
}else
if(temp >= 16 && temp <= 25){
System.out.println("It's Warm");
}else
if(temp > 25){
System.out.println("It's Hot");
}



}
}