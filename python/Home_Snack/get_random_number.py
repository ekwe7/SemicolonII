
import random;

def get_random_number():

	number = [];
	for count in range(1, 11):
		number.append(random.randint(1,50));
	print(number);
		
		
get_random_number();