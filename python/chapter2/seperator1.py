user = int(input('Enter a number: '))


num1 = user // 10000
user1 = num1 % 10

num2 = user // 1000
user2 = num2 % 10

num3 = user // 100
user3 = num3 % 10

num4 = user // 10
user4 = num4 % 10

num5 = user // 1
user5 = num5 % 10


print(user1, ' ', user2, ' ', user3, ' ', user4, ' ', user5)