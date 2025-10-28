import java.util.Scanner;

public class GcdOfTwoNumber{
public static void main(String...ekwe){
	Scanner input = new Scanner(System.in);
	
System.out.print("ENter number: ");
int number1 = input.nextInt();
System.out.print("ENter number: ");
int number2 = input.nextInt();

int gcd = 1;
int total;

if(number1 > number2){
	total = number1;
}else{
	total = number2;
}

for(int count = 1; count <= total; count++){
	if(number1 % count == 0 && number2 % count ==0){
	gcd = count;
	}

}
System.out.print(gcd);
	
}
}