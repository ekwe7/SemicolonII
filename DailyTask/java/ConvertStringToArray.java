public class ConvertStringToArray{


public static String[] convertToString(String words){
return words.trim().split("\\s+");
}



public static void main(String... args){

String[] output = convertToString("I Love Programming");

        System.out.print("[");
        for (int index = 0; index < output.length; index++){
            System.out.print(output[index]);
            if (index < output.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }



}