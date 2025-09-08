import java.util.Scanner;

public class QuestionAndResponse{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("What is your name? ");
String name = input .nextLine();

System.out.print("How old are you? ");
int age = input .nextInt();

System.out.print("");

if(age < 13) {
System.out.println("You are a young achiever!");
} else if (age < 20) {
System.out.println("Teen vibe!");
} else if (age < 30) {
System.out.println("Young and vibrant!");
} else {
System.out.println("Wisdom keeps you dazzling, day along!");
}

System.out.print("How are you feeling today? (Happy/Sad/Bored/Tired) ");
String mood = input .nextLine();

String suggestion = "";
if(mood.equals("happy")) {
suggestion = "Keep smiling! Try a new activity.";
}else 
if(mood.equals("sad")) {
suggestion = "Cheer up! Try watching a new movie.";
} else 
if(mood.equals("bored")){
suggestion = "Read a book or play a new game!";
} else 
if(mood.equals("tired")) {
suggestion = "Rest well and recharge for a new day!";
} else{
suggestion = "Hope you have a nice day!";
}
System.out.println(suggestion);

System.out.print("Can I guess your favorite animal? (yes/no) ");
String guess = input .nextLine();

if(guess.equals("yes")) {
System.out.println("Is it a dog?");
System.out.print("Am I right? (yes/no) ");
String correct = input.nextLine();

if(correct.equals("yes")) {
System.out.println("Yay! I guessed it right!");
}else{
System.out.println("Oh! I'll try better next time.");
}
}

System.out.println("All done, " + name + "! Here is a suggestion for the day: " + suggestion);





}
}