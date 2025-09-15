import java.util.Scanner;

public class StudentGradeCounter{
public static void main(String []args){

Scanner input = new Scanner(System.in);

int counterA = 0, counterB = 0, counterC = 0, counterD = 0;

for(int index = 0; index <= 5; index++){
System.out.print("Enter Student name: ");
String Name = input.nextLine();

System.out.print("Enter Student grade (A, B, C, D): ");
char grade = input.nextLine().charAt(0);
	
switch(grade){
	case 'A': counterA++;
	break;
	case 'B': counterB++;
	break;
	case 'C': counterC++;
	break;
	case 'D': counterD++;
	break;
	default:
	System.out.println("idiot enter a valid input");
	}

}
	System.out.println("Grade Result\n");
	
System.out.println("Number of Students with A: " + counterA);
System.out.println("Number of Students with A: " + counterB);
System.out.println("Number of Students with A: " + counterC);
System.out.println("Number of Students with A: " + counterD);



}
}