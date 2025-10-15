
public class ReversedNumber{
public static void main(String... ekwe) {

int number = 1234569;
int reversedNumber = 0;

for (; number > 0; number /= 10) {
reversedNumber = reversedNumber * 10 + number % 10;

}

System.out.print(reversedNumber);

}
}
