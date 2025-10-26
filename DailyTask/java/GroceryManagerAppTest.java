import java.util.ArrayList;

public class GroceryManagerApp{
    private ArrayList<String> groceryList = new ArrayList<String>();

    public String checkGroceryInStock(){
	return groceryList.size();
     }

}