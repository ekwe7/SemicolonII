
number = 4355625;

original = number
reversed_num = 0

while number > 0:
    temp = number % 10;
    reversed_num = reversed_num * 10 + temp;
    number //= 10;
    
if original == reversed_num:
    print(original, "is a palindrome")
else:
    print(original, "is not a palindrome")