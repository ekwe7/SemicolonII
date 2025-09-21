numbers = [9, 11, 22, 34, 17, 22, 34, 22, 40, 34]
number_lenght = len(numbers)
get_mean = sum(numbers)
mean = get_mean / number_lenght

#number.sort()

if numbers % 2 == 0:
	check1 = numbers[number_lenght // 2] 
	check2 = numbers[number_lenght // 2 -1] 
	meadian = (check1 + check2) / 2

	median = numbers[number_lenght // 2]

print(mean)
print(meadian)

