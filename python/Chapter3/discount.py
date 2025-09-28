"""program that applies tiered discount base on customer's
total spending in a store"""

purchase_price = int(input("Enter total amount "))


if (purchase_price) >= 1000 or (purchase_price) <= 10000:
	price_balance = purchase_price * 5 / 100
	balance_after_purchase  = purchase_price - price_balance

elif (purchase_price) >= 10000 or (purchase_price) <= 50000:
	price_balance = purchase_price * 10 / 100
	balance_after_purchase = purchase_price - price_balance

elif (purchase_price) > 50000:
	price_balance = purchase_price * 20 / 100
	balance_after_purchase = purchase_price - price_balance

else: (purchase_price) <= 999

print(f" no discount for you try again later{balance_after_purchase:}")
print(f" Your price aftre discount is {balance_after_purchase:,.2f}")
	