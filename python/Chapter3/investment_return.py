loan_amount = int(input("Enter amount you want to loan: "))

yearsof_interest = int(input("Enter number of years: "))

interest_rate = 7
interest = interest_rate / 100

for loop in range(yearsof_interest):

	total = loan_amount*(1 + interest_rate)*yearsof_interest
	print(total)
