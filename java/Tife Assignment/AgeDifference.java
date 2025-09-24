import java.util.Scanner;

public class AgeDifference{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter father's age (1-80): ");
int currentFatherAge = input.nextInt();

System.out.print("Enter son's age (1-80): ");
int currentSonAge = input.nextInt();

if(currentFatherAge < 1 || currentFatherAge > 80 || currentSonAge < 1 || currentSonAge > 80) {
System.out.println("Invalid enter age between (1-80)");
return;
}

int ageDifference = Math.abs(currentFatherAge - 2 * currentSonAge);
System.out.println(ageDifference);

}    
}
