
number = 12345678
largest = 0
for digit in str(number):
    if int(digit) > largest:
        largest = int(digit)
print(largest)