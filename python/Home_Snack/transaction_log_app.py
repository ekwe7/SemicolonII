
current_balance = 0
my_transactions = []


while True:

    print("1. Deposit")
    print("2. Withdraw")
    print("3. View History")
    print("0. Quit")

    user_choice = input("Choose an option: ")

    if user_choice == "1":
        try:
            amount = float(input("Enter deposit amount: "))
            if amount <= 0:
                print("Invalid amount Entry")
            else:
                current_balance += amount
                my_transactions.append(f"Deposit: {amount}")
                print(f"Deposited amount is {amount}. Current balance: {current_balance}")
        except ValueError:
            print("Invalid")

    elif user_choice == "2":

        try:
            amount = float(input("Enter withdraw amount: "))
            if amount <= 0:
                print("Invalid amount entry")

            elif amount > current_balance:
                print("Chief you don't have sufficient balance")
            else:
                current_balance -= amount
                my_transactions.append(f"Withdrawal: {amount}")
                print(f"Your withdrawal amount is {amount}. Current balance: {current_balance}")

        except ValueError:

            print("Abeg enter a number: ")

    elif user_choice == "3":

        if not my_transactions:

            print("Run transaction Boi")

        else:

            for index, transaction in enumerate(my_transactions):
                print(f"{index+1}. {transaction}")
            print(f"\nCurrent balance: {current_balance}")

    elif user_choice == "0":

        print("Alright see you later")
        break
    else:
        print("Enter a valid input Chief")