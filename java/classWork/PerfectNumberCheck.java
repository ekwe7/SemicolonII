import java.util.Scanner;

public class PerfectNumberCheck{
public static void main(String...ekwe){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

int sum = 0;
	
for(int num = 1; num <= number /2; num++){
	if(number % num == 0){
		sum += num;
	}
}
	if(sum == number){
	System.out.print(number + " is a perfect number");
	}else{
	System.out.print(number + " is not a perfect number");
	}

}

}
