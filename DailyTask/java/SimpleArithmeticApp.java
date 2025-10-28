import java.util.Random;
import java.util.Scanner;

public class SimpleArithmeticApp{
public static void main(String[] args){
  
Scanner input = new Scanner(System.in);
    
System.out.print("Enter your name: ");
String userName = input.nextLine();
    
Random random = new Random(System.currentTimeMillis());

long start = System.currentTimeMillis();
int score = 0;

for (int index = 0; index < 2; index++){
int number1 = random.nextInt(101);
int number2 = random.nextInt(number1 + 1);
      
int rightAnswer = number1 - number2;
int numberOfTries = 2;

System.out.println("\nWhat is :" + number1 + " - " + number2);

while (numberOfTries> 0) {
 System.out.print("ENter your Answer: ");

try{
        
int answer = Integer.parseInt(input.nextLine());
          
if(answer == rightAnswer){
System.out.println("Correct Anwser");
	score++;
break;
            
}else{

numberOfTries--;
System.out.println("Incorrect anwser you have " + numberOfTries + "left");

}
          
} catch (NumberFormatException e){
          numberOfTries--;
System.out.println("you have " + numberOfTries + "left");

}
}

if (numberOfTries == 0){

System.out.println("Answer was " + rightAnswer);

}
}


System.out.println("\nYour score is : " + score + " / 10");




    
}
}