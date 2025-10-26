
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringIsUpperTest{

	@Test
	public void testThatStringIsUpper(){
	
		ConvertStringToUpper stringUpper = new ConvertStringToUpper();
		
		String expected = "SEMICOLON";
		String result = stringUpper.stringIsUpperCase("SEMICOLON");
		
		assertEquals(expected, result);
	
	}
	
	
}