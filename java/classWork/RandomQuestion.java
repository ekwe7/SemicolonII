import java.util.Scanner;

public class RandomQuestion{
public static void main(String ozy[]){

Scanner input = new Scanner(System.in);

int number1 = (int)(Math.random() * 5);
int number2 = (int)(Math.random() * 5);

System.out.print("what is " + number1 +" "+ number2);
int ans = input.nextInt();

while(number1 + number2 != ans){
System.out.println("What is " + number1 + " " + number2);
ans = input.nextInt();

}
System.out.println("correct anwser is " + ans);


}
}