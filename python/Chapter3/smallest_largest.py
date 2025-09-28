number1 = int(input("Enter first number: "))
number2 = int(input("Enter second number: "))
number3 = int(input("Enter third number: "))
number4 = int(input("Enter fourth number: "))

sum = number1 + number2 + number3 + number4
average = sum / 4
product = number1 * number2 * number3 * number4
smallest = min(number1, number2, number3, number4)
largest = max(number1, number2, number3, number4)
print(f"The sum is {sum}")
print(f"The average of number is {average}")
print(f"The product is {product}")
print(f"The smallest number is {smallest}")
print(f"The largest number is {largest}")