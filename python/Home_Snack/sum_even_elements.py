
def sum_even_elements(number):
    total = 0
    for index in range(len(number)):
        if index % 2 == 0:
            total += number[index]
    return total

output = [11, 33, 4, 9, 0, 45, 5]
print(sum_even_elements(output))
