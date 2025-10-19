public class LeapYear{
public static void main(String...args){

int start = 1900;
int end = 2025;

for(int count = start; count <= end; count++){
	if((count %  400 ==  0)||(count % 100 != 0) && (count % 4 == 0)){
	System.out.print(count + " ");
	}
}

}
}