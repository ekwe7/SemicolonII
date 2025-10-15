
public class CountNumberOfUppercase{
public static void main(String... ekwe){

String userWord = "SemiColon";
int uppercaseCount = 0;

for(int index = 0; index < userWord.length(); index++){

if(Character.isUpperCase(userWord.charAt(index))){

uppercaseCount++;

}
}

System.out.print(uppercaseCount);


}
}