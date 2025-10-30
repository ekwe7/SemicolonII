
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DepreciationOfValueTest{


	@Test
	public void testThatPriceDepreciateByEightPercent(){
	
	myCalculation = new DepreciationOfValue();
	
	double result =  myCalculation.yearDepreciation();
	
	assertEquals(8, result);
	
	
	}

	


}