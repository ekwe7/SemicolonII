user_password = input("Enter your password: ")

if len(user_password) < 8:

	print("very weak password")

elif len(user_password) == 8:

	print("weak password")

elif len(user_password) >= 8 and len(user_password) <= 16:

	print("strong password")
else: 
	print("very strong password")