
public class ReversedString{
public static void main(String...ekwe){

String word = "Semicolon";
String userWord = word.toLowerCase();
String reversed = "";

for(int index = userWord.length()-1; index >= 0; index--){
	reversed += userWord.charAt(index);

}
	System.out.print(reversed);

}


}