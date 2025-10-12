

def get_longest_word_in_list(word):

	if len(word) < 0:
		return 0;
		
	longest_word = word[0];
	
	for index in word:
		if len(index) > len(longest_word):
			longest = index;
			
	return longest, len(longest);
	
my_list = ["cat", "Semicolon", "Achalugo", "Ifechukwu"];

result, result_length = get_longest_word_in_list(my_list);

print(f"logest word is: {result}, result_lenght: {result_length}");
	
	
		 