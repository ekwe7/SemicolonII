

number = 1234598

smallest = 9

for digit in str(number):
    if int(digit) < smallest:
        smallest = int(digit);
        
print(smallest)