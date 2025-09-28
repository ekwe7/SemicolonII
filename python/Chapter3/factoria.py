user_input = int(input("Enter a number:"))

factoria = 1

for i in range(1, user_input + 1):
	factoria *= i
print(factoria)