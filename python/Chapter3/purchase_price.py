	#question3.21
price = float(input("Enter purchase price "))
while price < 0: or price > 1:
	price = ("invalide, Enter a valid number")

change = round((1.00 - price) * 100)

quarters = changes // 25
change %= 25

dimes = change // 10
change %= 10

pennies = change

print("Your change is ")

if quarters: print(f"{quarters} quarter {'s' if quarters > 1 else''}")
if dimes: print(f"{dimes} dime{'s' if dimes > 1 else ''}")
if pennies: print(f"{pennies} pennie{'s' if pennies > 1 else ''}")