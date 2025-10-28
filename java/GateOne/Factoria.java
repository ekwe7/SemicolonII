import java.util.Scanner;

public class Factoria{
public static void main(String[] args){
	
	
Scanner factoria = new Scanner(System.in);

System.out.print("Enter a value ");
int number = factoria.nextInt();
	
if(number < 0){
System.out.println("Factoria not defined!");
}else{

long factorial = 1;
for(int i=1; i<=number; i++) {
factorial *=i;
}

System.out.println
("factorial of " + number +" is " +factorial);

}
}
}