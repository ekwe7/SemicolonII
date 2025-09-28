gallon = 0
total = 0
miles = 0
sentinel = 0

while sentinel != -1:
	gallon = float(input("Enter gallons in liters"))
	miles = int(input("Enter miles driven "))
	car_tank = gallon / miles
print(f"No of gallon/ miles for this tank is {car_tank}")
sentinel = int(input("Enter o to continue -1 to stop"))
gallons += gallon
miles += mile

total = miles / gallons

print(f"The average is {total}")