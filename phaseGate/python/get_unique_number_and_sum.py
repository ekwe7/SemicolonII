
def get_unique_number_and_sum(numbers):
	sum = 0
	unique_value = []
	
	for index in numbers:
		if numbers[index] != index:
			sum = index + numbers[index];
			unique_value.append(sum);
		return sum 

myNumber = [1,2,3,2];

result = get_unique_number(myNumber);
print(result);
	