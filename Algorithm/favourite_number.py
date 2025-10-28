

favourite_number = 7;


while True:
	number_guess = int(input("Guess the number: "));
	if(number_guess == favourite_number):
		print("That's my favourite number");
		break
	else: 
		print("Nice try, guess again ");

