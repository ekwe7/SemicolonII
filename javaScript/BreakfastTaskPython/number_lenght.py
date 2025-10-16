number = int(12345)

numbercount = 0

store = ""

while number > 0:
	remainder = number % 10
	numbercount += 1
	number //= 10
print(numbercount )