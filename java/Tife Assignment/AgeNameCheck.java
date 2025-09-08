import java.util.Scanner;
public class AgeNameCheck{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter Your name q: ");
String name1 = input.nextLine();
System.out.print("Enter your age: ");
int age1 = input.nextInt();

input.nextInt();

System.out.print("Enter Your name is: ");
String name2 = input.nextLine();
System.out.print("Enter your age: ");
int age2 = input.nextInt();

input.nextInt();

System.out.print("Enter Your name: ");
String name3 = input.nextLine();
System.out.print("Enter your age: ");
int age3 = input.nextInt();

String youngest = name1;
int minAge = age1;

String oldest = name1;
int maxAge = age1;

if(age2 < minAge){
	minAge = age2;
	youngest = name2;

}

if(age2 > maxAge){
	maxAge = age2;
	oldest = name2;

}

if(age3 < minAge){
	minAge = age3;
	youngest = name3;

}

if(age3 > maxAge){
	maxAge = age3;
	oldest = name2;

}

System.out.print("The youngest person is: " + youngest);
System.out.print("The oldest person is : " + oldest);


}
}