
def string_that_end_with(word):
	if len(word) < 3:
		return word
	elif word.endswith('ing'):
		return word + 'ly';
	else:
		return word + 'ing';
		
result = string_that_end_with("poling");
print(result);