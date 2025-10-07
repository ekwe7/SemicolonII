
minimum_age = 10;

try:

	age = int(input("Enter your age: "));
	if(age > minimum_age):
		print("Welcome to the show");
	elif (age < minimum_age):
		print("Sorry you are too young");
except ValueError:
		print("invalid Entry");