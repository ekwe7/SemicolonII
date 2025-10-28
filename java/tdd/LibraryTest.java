
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LibraryTest{

	@Test
	public void testThatLibraryHasNoBook(){

	//Arrange
	Library library = new Library();
	
	//Act
	int result = library.totalNumberOfBooks();
	
	//Assert
	assertEquals(result, 0);
	
	}
	
	@Test
	public void testThatOneBooKISAddedToTheLibraryAndTheTotalNumberOfBooksIsOne(){
	//Arrang
	Library library = new Library();
	
	//Act
	String response = library.addBook("Things fall Apart");
	
	//Assert
	assertEquals(response, "Added successfully");
	
	
	}

	

	
}








