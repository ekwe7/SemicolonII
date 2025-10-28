import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroceryManagerAppTest{
    private GroceryManagerApp myGrocery;

	@BeforeEach
	public void setUp(){
		myGrocery = new GroceryManagerApp();

	}


	@Test
	public void testThatStoreHasNoItem(){
	
		String result = myGrocery.checkGroceryInStock();
		assertEquals("0", result);
	}
	
	
	@Test
	public void testThatOneItemAddedToTheGrocery(){
		myGrocery.addGrocery("Apples");
	
		String result = myGrocery.checkGroceryInStock();
		
		assertEquals("1", result);
	}


    @Test
    public void testThatSameItemCannnotBeAddedTwic(){
        myGrocery.addGrocery("Apples");
        
        String result = myGrocery.addGrocery("apples");
        
        assertEquals("item already exist", result);
        assertEquals("1", myGrocery.checkGroceryInStock());
    }
    
    
    	@Test
	public void testThatTwoItemAddedToTheGrocery(){
		myGrocery.addGrocery("Apples");
		myGrocery.addGrocery("Orange");
	
		String result = myGrocery.checkGroceryInStock();
		
		assertEquals("2", result, "Grocery added Successfully");
	}



	@Test
	public void testToRemoveItemThatNeverInGrocery(){
		myGrocery.addGrocery("Apples");
		
		String result = myGrocery.removeFromGrocery("Bananas");
        
		assertEquals("item does not exist", result);
		assertEquals("1", myGrocery.checkGroceryInStock());
    }


	@Test
	public void testRemoveGrocerySuccess(){
		myGrocery.addGrocery("Apples");
		
		String result = myGrocery.removeFromGrocery("Apples");
		
		assertEquals("Grocery removed Successfully", result);
		assertEquals("0", myGrocery.checkGroceryInStock());
    }   
    
    
	@Test
	public void testShowEmptyList(){
		String result = myGrocery.showAllItems();
		
		assertEquals(result, "Theres's no item in the list yet");
	}
    
    
	@Test
	public void testShowOneItem(){
	
		myGrocery.addGrocery("Apples");
		
		String result = myGrocery.showAllItems();
		
		assertEquals("Items: Apples, ", result);
    }
    
    
	@Test
	public void testShowTwoItems(){
	
        myGrocery.addGrocery("Apples");
        myGrocery.addGrocery("Bananas");
        
        String result = myGrocery.showAllItems();
        
        assertEquals(result, "Items: Apples, Bananas, ");
    }
    
    
    
    
   
}