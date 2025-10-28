
def smallestNumber(my_list=[]) -> int:
	my_number = my_list[0]
	
	for number in my_list:
		if number < my_number:
			my_number = number
	return my_number
			