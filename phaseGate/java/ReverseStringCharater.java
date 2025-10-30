

public class ReverseStringCharater{
public static void main(String[] args){

String myWord = "abdcd";
String name = "efd";
the output is "dcdbaefd"

System.out.println(getReversedString(myWord));

}


public static String getReversedString(String word){

String reversed = "";

for (int count = 0; count < word.length; count++){
reversed = count + reversed;
}
return reversed;

}






}


