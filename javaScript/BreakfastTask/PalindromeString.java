
public class PalindromeString{
public static void main(String... args) {

String stringWord = "maaam";
boolean isPalindrome = true;


for (int index = 0; index < stringWord.length(); index ++){
for (int count = stringWord.length() - 1 - index ; count > index; count --){

if (stringWord.charAt(index) != stringWord.charAt(count)){

isPalindrome = false;


	}
  }
  
}

System.out.println(isPalindrome);

}
}


