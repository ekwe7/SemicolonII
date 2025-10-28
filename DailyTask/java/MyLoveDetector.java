import java.util.Scanner;

public class MyLoveDetector{
public static void main(String[] args){
        
Scanner scanner = new Scanner(System.in);

while (true){
 
System.out.print("Count first flower: ");
int firstUser = scanner.nextInt();

System.out.print("count second second flower: ");
int secondUser = scanner.nextInt();

scanner.nextLine();

boolean number1 = firstUser % 2 == 0;
boolean number2 = secondUser % 2 == 0; 

boolean loveChecker= number1 != number2;

if(loveChecker){
System.out.println("They are in love!");
} else {
System.out.println("They are not in love.");
}

System.out.print("you want play again boy? (yes/no): ");

String result = scanner.nextLine().toLowerCase();
if (result .equals("no")){
System.out.println("Goodbye");
break;



}
}
        
        
}
}



