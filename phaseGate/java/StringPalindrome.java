public class StringPalindrome{
public static String[] isPalindrome(String[] myList){

String[] result = new String[myList.length];

for (int index = 0; index < myList.length; index++){
String word = myList[index];
String reversed = "";

for (int count = word.length() - 1; count >= 0; count--){
reversed += word.charAt(count);

}

if (word == reversed){
result[index] = "True";

}else {
result[index] = "False";

  }

}

return result;

}



public static void main(String[] args){

String[] myList = {"madem", "racecar", "hello", "noon", "1331"};

String[] result = isPalindrome(myList);

for(String output : result){

System.out.print(output + " ");

	}
}


}



