import java.util.Scanner;

public class FatherSonAge{
public static void main(String []ozy){

Scanner input = new Scanner(System.in);

System.out.print("ENter father age: ");
int fatherAge = input.nextInt();

System.out.print("Enter son age:");
int sonAge = input.nextInt();


if(fatherAge < 1 && fatherAge > 80 && sonAge < 1 && sonAge > 80){
	System.out.print("Invalid, Enter a valid age ");
}

int ageDifference = fatherAge - 2 * sonAge;

System.out.println(ageDifference);

}
}