import java.util.Scanner;

public class QuestionAndResponse{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("What is your name? ");
String name = input .nextLine();
System.out.print("How old are you? ");
int age = input .nextInt();

if(age < 13) {
System.out.println("You are a young achieve");
} else if (age < 20) {
  System.out.println("Teen vibe");
} else if (age < 30) {
  System.out.println("Young and vibrant!");
} else {
System.out.println("Wisdom keeps you dazzling");
}

System.out.print("How are you feeling today chief (Happy/Sad/Bored/Tired) ");
String mood = input .nextLine();
input.nextLine();


String suggestion = "";
if(mood.equals("happy")) {
suggestion = "Keep smiling! Try a new activity";
}else 
if(mood.equals("sad")) {
suggestion = "Cheer up chief Try watching a new movie";
} else 
if(mood.equals("bored")){
suggestion = "Read a book or play a new game";
} else 
if(mood.equals("tired")) {
suggestion = "Rest well high chief and recharge for a new day";
} else{
suggestion = "Hope you have a nice day chief";
}
System.out.println(suggestion);

System.out.print("Can I guess your favorite animal? (yes/no) ");
String guess = input .nextLine();
input .nextLine();

if(guess.equals("yes")) {
System.out.println("Is it a dog");
System.out.print("Am I right (yes/no) ");
String correct = input.nextLine();


if(correct.equals("yes")) {
System.out.println("Yaah I guessed it right abi");
}else{
System.out.println("Wow I will try better maybe next time");
}
}

System.out.println("well-done, " + name + "here is a suggestion for the day chief " + suggestion);





}
}