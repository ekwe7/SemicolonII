my_lists = ["Apple", "Banana", "Kiwi", "grapes", "Cherry"];

def filter_out_string(word):
	
		return len(word) > 5;
		
result = list(filter(filter_out_string, my_lists));
print(result);