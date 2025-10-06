
password = "secret123";

number_of_attempts = 5;

counter = 0;

while counter < number_of_attempts:
    user_password = input("Enter your password: ");
    
    if user_password == password:
        print("wow! Access granted");
        break
    else:
        counter += 1
        print(f"Access Denied. You have {number_of_attempts - counter } attempts left")
else:
    print("Access denied")