
def remove_char_that_have_odd_index(word):
	result = "";
	for count in range(len(word)):
		if count % 2 == 0:
		
			result += word[count];
		
	return result;
		

result =  remove_char_that_have_odd_index("Semicolon");

print(result);