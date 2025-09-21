principal = float(input ("Enter loan amount "))

annual_rate = float(input("Enter Annual interest rate "))

loan_duration = int(input("Enter duration of mortgage year "))

pricipal = annual_rate / 1200 
number_year = loan_duration * 12

monthly_year = ((principal * annual_rate) / (1 - (1 + annual_rate) ** -number_year))

print (monthly_year) 


