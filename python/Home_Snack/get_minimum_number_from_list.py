
def get_minimum_number_from_list(my_list):
	
	minimum_number = my_list[0];
	
	for number in my_list:
		if number < minimum_number:
			minimum_number = number;
			
	return minimum_number;
		
my_list = [34, 6, 9, 67, 8, 2];

result = get_minimum_number_from_list(my_list);
print(result)