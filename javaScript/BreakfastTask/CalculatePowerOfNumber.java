
public class CalculatePowerOfNumber{
public static void main(String... args){


int numberBase = 2;
int number = 5;

int result = 1;

for(int index = 0; index < Math.abs(number); index++){
result *= numberBase;

}

if(number < 0){
result = 1 / result;

}

System.out.println(numberBase + " raised to " + number + " is " + result);


}
}