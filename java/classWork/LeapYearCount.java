public class LeapYearCount{
public static void main(String...args){

int start = 1900;
int end = 2025;
int sum = 0;

for(int count = start; count <= end; count++){
	if((count %  400 == 0)||(count % 100 != 0) && (count % 4 == 0)){
	sum += count;
	
	}
	
	
}
System.out.print(sum + "");

}
}
