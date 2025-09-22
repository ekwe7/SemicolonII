
favorite_number = 7;

while True:
	number_guess = int(input("Enter a number: "));
	if(number_guess == favorite_number):
		print("That's my favorite!");
		break;
	else: 
		print("Nice try, guess again")