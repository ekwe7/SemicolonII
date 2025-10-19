public class Fibonnaci{
public static void main(String...ekwe){

int number1 = 0;
int number2 = 1;

for(int count=2; count < 20; count++){
	int temp = number1 + number2;
	System.out.print(temp + " ");
	number1 = number2;
	number2 = temp;
}

}
}