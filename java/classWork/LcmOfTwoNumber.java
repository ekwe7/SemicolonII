import java.util.Scanner;
public class LcmOfTwoNumber{
public static void main(String...ekwe){

Scanner input = new Scanner(System.in);

System.out.print("Enter a numbetr: ");
int number1 = input.nextInt();
System.out.print("ENter a number: ");
int number2 = input.nextInt();

int lcmNumber; 
if (number1 > number2){
	lcmNumber = number1;
}else{
	lcmNumber = number2;
}

for(; lcmNumber <= number1 * number2; lcmNumber++){
	if(lcmNumber % number1 ==0 && lcmNumber %number2 == 0){
	}
}
System.out.print(lcmNumber);

}

}