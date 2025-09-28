while True:
	user_input= int(input("Enter a number "))
	if user_input >= 1:
		break
	print("Enter a positive number")

for counter in range(user_input, 0, -1):
	print(counter)

print("Blast off")