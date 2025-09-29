import java.util.Scanner;

public class PrimeOddNumber{
public static void main(String []args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a nmber: ");
int number = input.nextInt();


if(number % 2 == 0){
System.out.println("Prime Number");
}else{
System.out.println("Odd Number");
}

}
}