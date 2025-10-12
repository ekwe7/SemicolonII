
def get_first_and_last_two_in_a_word(word):
	if len(word) < 2:
		return "";
	else: 
		first_two_char = word[0] + word[1] 
		last_two_char = word[-2] + word[-1];
		
		return first_two_char + last_two_char;
		

result = get_first_and_last_two_in_a_word("Semicolon");
print(result);