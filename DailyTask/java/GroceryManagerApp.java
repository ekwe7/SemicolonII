import java.util.ArrayList;

public class GroceryManagerApp{
    
ArrayList<String> groceryList = new ArrayList<String>();


public String checkGroceryInStock(){
	return String.valueOf(groceryList.size());
	
}
    
    
public String addGrocery(String groceryTitle){

for(String grocery : groceryList){
	if(grocery.equalsIgnoreCase(groceryTitle)){
	return "item already exist";
	}
	
}
groceryList.add(groceryTitle);
return "Grocery added Successfully";

}

    
public String removeFromGrocery(String groceryTitle){

for (int index = 0; index < groceryList.size(); index++){
	if(groceryList.get(index).equalsIgnoreCase(groceryTitle)) {
	groceryList.remove(index);
return "Grocery removed Successfully";
	
	}
}
return "item does not exist";

}


public String showAllItems(){

if(groceryList.isEmpty()){
	return "Theres's no item in the list yet";
}

String result = "Items: ";

for(int index = 0; index < groceryList.size(); index++){
	result += groceryList.get(index);
	if (index < groceryList.size()) {
		result += ", ";
	}
  }
	return result;
}    






}