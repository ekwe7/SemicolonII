
myNumbers = [1,2 ,3, 4, 5, 6];

def get_even_number(number):
	return number % 2 != 1;
	
result = list(filter(get_even_number, myNumbers));

print(result);