public class FibonnaciNumbers{
public static void main(String...ekwe){

int number1 = 0;
int number2 = 1;

int temp = 0;

System.out.print(number1 + " " + number2);
for(int index = 0; index < 20; index++){
	temp = number1 + number2;
	System.out.print(temp);
	number1 = number2;
	number2 = temp;
		
}
System.out.print(number2 +" ");

}
}

