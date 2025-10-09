
def get_length(number):

	count = 0
	for index in number:
		count += 1
	return count

output = [11, 33, 46, 9, 0, 45, 5]

total_length = get_length(output);

print(total_length);