
def get_maximum_number_from_list(my_list):
	
	maximum_number = my_list[0];
	
	for number in my_list:
		if number > maximum_number:
			maximum_number = number;
			
	return maximum_number;
		
my_list = [34, 6, 9, 67, 8, 2];

result = get_maximum_number_from_list(my_list);
print(result)
