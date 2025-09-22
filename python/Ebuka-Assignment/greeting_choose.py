

user_name = "Alex";


while True:
	name = input("Enter your name: ");
	user = name.lower();
	if(name == user_name):
		print("Hello my friend : {name}");
		break;
	else:
		print("Hi, Stannger");
