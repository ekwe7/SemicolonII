import java.util.Arrays;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestNumberTest{

@Test

public void testThatReturnSmallestNumber(){

SmallestNumberCheck smallest = new SmallestNumberCheck();

//arrange
int[] my_list = {2, 78, 8, 90, 4};
//act
int result = smallest.smallestNumberCheck(my_list);
//assert
assertEquals(2, result);




}

public void testThatReturnNegativeNumber(){
SmallestNumberCheck result = new SmallestNumberCheck();

int[] my_list = {2, 78, -5, 8, 90, 4, -2, -7, -100};
int output = result.smallestNumberCheck(my_list);

assertEquals(-100, output);


}



}