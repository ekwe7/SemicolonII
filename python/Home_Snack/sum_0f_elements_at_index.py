
def sum_0f_elements_at_index(number):
    total = 1
    for index in range(len(number)):
        if index % 3 == 0:
            total *= number[index]
    return total

output = [11, 33, 4, 9, 0, 45, 5, 2, 4]
print(sum_0f_elements_at_index(output))


