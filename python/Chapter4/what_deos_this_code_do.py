# def my_mistery_fact(number):
#     number = 0
#     for value in number:
#         nums += value ** 2
#         return nums
# print(my_mistery_fact(4))

#hahaha this code above does nothing

#this is called unpacking
first, second = 'he'
print(f'{first}, {second}')

#built-in function Enumarate
colors = ['red', 'green', 'blue', 'yellow', 'magenta', 'cyan']

for index, color in enumerate(colors):
    print(f'{index}. {color}')



numbers = [18, 6, 9, 2, 15]

print(f'index{"numbers":>9} Bar ')
for index, number in enumerate(numbers):
    print(f'{index}. {number:>8} {'=' * number}    ')