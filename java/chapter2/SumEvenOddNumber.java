import java.util.Scanner;

public class SumEvenOddNumber{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter 5 numbers one by one:");

int num1 = scanner.nextInt();
int num2 = scanner.nextInt();
int num3 = scanner.nextInt();
int num4 = scanner.nextInt();
int num5 = scanner.nextInt();

int sumEven = 0;
int sumOdd = 0;

if (num1 % 2 == 0){
sumEven = sumEven + num1;
}else{
sumOdd = sumOdd + num1;
}

if (num2 % 2 == 0){
sumEven = sumEven + num2;
}else{
sumOdd = sumOdd + num2;
}

if (num3 % 2 == 0){
sumEven = sumEven + num3;
}else{
sumOdd = sumOdd + num3;
}

if (num4 % 2 == 0){
sumEven = sumEven + num4;
}else{
sumOdd = sumOdd + num4;
}

if (num5 % 2 == 0){
sumEven = sumEven + num5;
}else
{sumOdd = sumOdd + num5;
}

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

    }
}