public class Kata{

//function that takes two integers and return true or false
public static boolean isEven(int number){
	
if(number % 2==0){
return true;
  }
else if(number % 2 != 0){
return false;
  }
  return true;
}



// funtion that takes an integer andreturn true or false
public static boolean isPrimeNumber(int number){
		
int counter = 0;
for( int count = 1 ; count <= number; count++){
	if(number % count == 0 ){
	++counter;}
}
 if(counter == 2){
	return true;
}
	else{
return false;
	}
}



//funtion that takes two numbers and returns the positive difference

public static int subtract(int number1, int number2){

int positiveDifference = 	Math.abs(number1 - number2);
return positiveDifference;

}


// function that takes two numbers and return the quotient

public static float divideNumber(float number1, float number2){
		
	return number1/number2;

} 


//function that takes 

public static int factorsOfNumber(int number){
int counter = 0;
for (int count = 1; count <= number; count++){
	if(number % count == 0){
	counter++;
	}
}
	return counter;
}


// Square of number
public static boolean isSquare(int number){
	
double squareOf = number ** 2;
	
if(number == squareOf){	
	return true;
}
else{
	return false;}	
	
}


// parlindrome number

public static boolean isPalindrome(int number){

int sum = 0;
int reversed = 0;
int tempNumber = number;

while(number > 0){
	reversed = number % 10;
	sum = (number * 10) + reversed;
number = number / 10;
}
if(tempNumber == number){}
	
	return true;
	
}

//function to cal. the factoria of number

public static long factorialOfNumber(long number){
int count = 1;
int factorial = 1;

while(count <= number){
	factorial = factorial * count;
	count++;
}
	return factorial;
}


public static long squareOf(int number){

int squareNumber = number * number;
	return squareNumber;
	
}




}