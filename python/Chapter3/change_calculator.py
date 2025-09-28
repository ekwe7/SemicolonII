
user_price = float(input("Enter purchase price (less than or equal to $1) "))

if user_price <= 0:

    print("Invalid price. Must be between")

else:
    change = round(1.00 - user_price, 2)
    cents = int(round(change * 100))

    dimes = cents // 25
    cents %= 25

    quarters = cents // 10
    cents %= 10

    pennies = cents

    print("Your change is: ")

print(f"{quarters}, quarter")
print(f"{dimes}, dime")
print(f"{pennies}, pennies")

