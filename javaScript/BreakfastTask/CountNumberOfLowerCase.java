
public class CountNumberOfLowerCase{
public static void main(String... ekwe){

String userWord = "SemiColon";
int lowerCaseCount = 0;

for(int index = 0; index < userWord.length(); index++){

if(Character.isLowerCase(userWord.charAt(index))){

lowerCaseCount++;

}
}

System.out.print(lowerCaseCount);


}
}
