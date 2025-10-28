
user_input = input("Enter your favourute pet (dog, cat): ");

output = user_input.lower();

if(output == "dog".lower() or output == "dogs".lower()):
	print("Woof! Dogs are awsome");
else:
	print(f"Cool {output} but i love Dogs");