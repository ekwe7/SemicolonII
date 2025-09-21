
import java.util.Scanner;
public class Vowel{
public static void main(String args[]){

Scanner input = new Scanner(System.in);

System.out.print("Enter a later: ");
char word = input.nextLine().toLowerCase().charAt(0);

if(word == 'a' || word == 'e' || word == 'o' 
	|| word == 'u' || word == 'i'){
	System.out.println(word + " Is a vowel");
}else
	if(word >= 'a' && word <= 'z'){
	System.out.println(word + " is a consonant");
	}else
	System.out.println("idiot enter a valid character");
	

}
}