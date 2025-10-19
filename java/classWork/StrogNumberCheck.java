import java.util.Scanner;

public class StrogNumberCheck{
public static void main(String...ekwe){

Scanner input = new Scanner(System.in); 

System.out.print("Enter a number: ");
int number = input.nextInt();

int sum = 0;
int temp = number;

for(; temp != 0; temp /= 10){
	int num = temp % 10;
	int factoria = 1;
	
	for(int count = 1; count <= num; count++){
		sum += factoria;
		
	}

}
if(sum == number){
System.out.print(number + " is perfect Number");

}else
	System.out.print(number + " not a perfect number");

}


}