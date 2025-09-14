import java.util.Scanner;
public class Asterics{
public static void main(String[] args){


int number = 5;

for (int rows = 1; rows <= number; rows++) {
for (int col = 1; col <= rows; col++) {
System.out.print("* ");
}
System.out.println();
}

System.out.println();


for (int rows = 1; rows <= number; rows++) {
for (int col = 1; col <= number - rows; col++) {
System.out.print("  ");
}
for (int counter = 1; counter <= rows; counter++) {
 System.out.print("* ");
}
System.out.println();
}


System.out.println();


for (int rows = number; rows >= 1; rows--) {
 for (int col = 1; col<= rows - rows; col++) {
System.out.print("  ");
 }
for (int counter = 1; counter <= rows; counter++) {
System.out.print("* ");
}
System.out.println();
}

System.out.println();

for (int rows = number; rows >= 1; rows--) {
for (int col = 1; col <= number - rows; col++) {
System.out.print("  ");
}
for (int counter = 1; counter <= rows; counter++) {
System.out.print("* ");
}
System.out.println();
}


}
}