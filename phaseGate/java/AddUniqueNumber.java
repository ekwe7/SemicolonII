
public class AddUniqueNumber{
public static void main(String[] args){
String str = "1, 2, 3, 2, 5";
System.out.println(sumOfUniqueNumbers(str));
}
public static int sumOfUniqueNumbers(String str){
String[] nums = str.split(",");
int sum = 0;

for(int index = 0; index < nums.length; index++){
nums[index] = nums[index].trim();
int counter = 0;

for(int count = 0; count < nums.length; count++){
if(nums[index].equals(nums[count].trim())){
counter++;

}
}

if(counter == 1){
sum += Integer.parseInt(nums[index]);
}
}
return sum;
}
}