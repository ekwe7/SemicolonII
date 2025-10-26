

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroceryManagerAppTest{
	private GroceryManagerApp app;

	@BeforeEach
	public void setUp(){
		grocery = new GroceryManagerApp();
	}
	
    
	@Test
	public void testCheckGroceryInStockWhenListIsEmpty(){
	
		String result = grocery.checkGroceryInStock("Apples");
		assertEquals(0, result);
    }
    
    
  
    