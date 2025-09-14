import java.util.Scanner;

public class StudentAge{
public static void main(String []args){

Scanner input = new Scanner(System.in);

System.out.print("ENter student age: ");
int studentAge = input.nextInt();

if(studentAge > 0 && studentAge <= 12){
	System.out.println("The Student is a Child");
}else 
if(studentAge >= 13 && studentAge <= 19){
	System.out.println("The Student is a Teen");
}else
if(studentAge >= 20 && studentAge <= 59){
	System.out.println("The Student is a Adult");
}else
if(studentAge >= 60){
	System.out.println("The Student is a Senoir");
}




}

}