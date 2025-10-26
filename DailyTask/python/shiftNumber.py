
number = [4, 0, 2, 0, 1, 0, 3];

def shiftNumber(input):
	num = [];
	for index in range(len(input)):
		if index == 0:
			num.append(index);
			if index != 0:
				result = number + num
				return result;
		
		
print(shiftNumber(number));