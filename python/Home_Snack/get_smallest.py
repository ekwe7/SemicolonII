
def get_smallest(number):

    smallest = number[0];
    
    for num in number:
        if num < smallest:
            smallest = num;
    return smallest;

my_list = [5, 2, 8, 12, 3];
output = get_smallest(my_list);
print(output );