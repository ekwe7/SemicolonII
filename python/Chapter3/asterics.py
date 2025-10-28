for numbers in range(1, 11):
	for number in range(numbers):
		print('*', end=" ")
	print()

print(" ")

for number in range(10, 0, -1):
	for numbers in range(0, number, 1):
		print('*', end=" ")
	print()
#print(" ")

numbers = 10
for number in range(numbers):
	for space in range(number, numbers,):
		print(" ", end=" ")
	for num2 in range(number+1):
		print(f"{'*'}", end=" ")
	print()
print(" ")

numbers = 10
for number in range(numbers):
	for space in range(number+1):
		print(" ", end=" ")
	for num2 in range(number, numbers):
		print(f"{'*'}", end=" ")
	print()
