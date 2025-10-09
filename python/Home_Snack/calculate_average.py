
def calculate_average(number):

	total = 0;
	for num in number:
		total = total + num;
	average = total / len(number);
	return average;


my_numbers = [1, 2, 3, 87, 9, 4, 5];

output = calculate_average(my_numbers);
print(output);