
def access_element(numbers):
	numbers.remove(2);
	return numbers
		
my_list = [1, 2, 3, 4, 5,];
output = access_element(my_list)
print(output)


def access_third_element(numbers):
	return numbers[2];
	
my_list = [10, 20, 30, 40, 50];
print(access_third_element(my_list));


def get_list_color(colors):
	colors.append("purple");
	return colors;
	
my_list = ['red', 'green', 'blue']
print(get_list_color(my_list));


def change_color(colors):
	colors.pop(2);
	colors.insert(2, "yelllo");
	return colors
	
colors = ['red', 'greenb', 'blue']
print(change_color(colors))


def sort_in_acsending_order(numbers):
	numbers.sort();
	return numbers
	
my_list = [4, 1, 3, 9, 2];
print(sort_in_acsending_order(my_list));



def combine_list(number1, number2):
	output = number1 + number2;
	return output;
	
my_list = [2, 4, 6];
my_list2 = [3, 1, 9];

output = combine_list(my_list, my_list2);
print(output);


def get_lenght_of_each_element(word):
    counter = []
    number = 3
    for count in word:
        if len(count) > number:
            counter.append(len(count))
    return counter

my_list = ['Alice', 'Bob', 'Charlie', 'Semicolon']
print(get_lenght_of_each_element(my_list))
	


def get_new_list_of_even(numbers):
    new_list = []
    for number in numbers:
        if number % 2 == 0:
            new_list.append(number)
    return new_list

my_list = [4, 7, 8, 9, 12]
print(get_new_list_of_even(my_list))
			


def get_number_of_element_in_list(word):
	counter = "";
	for count in word:
		if(len(word) > len(counter)):
			count = word;
			count = len(word);
		return count;
	
my_list = ['Alice', 'Bob', 'Charlie'];
print(get_lenght_of_each_element(my_list));


	