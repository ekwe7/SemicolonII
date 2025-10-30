public class CharFrequencyInString {

    public static void main(String[] args){
        String myWord = "Hello world";
        char character = 'l';
        System.out.println(numberOfOccurance(myWord, character));
    }



public static int numberOfOccurance(String words, char character){

int frequency = 0;

for (int index = 0; index < words.length(); index++) {
if (words.charAt(index) == character) {
frequency++;

}
}

return frequency;

}
}
