"""

def get_string_length(words):

	counter = 0;

	for index in words:
		for count in index:
			counter = count + 1;
	return counter;
				
				
output = get_string_length("James");

print(output);



"""
def equivalent_minute(minute):

	seconds = minute * 60;
	hour = minute / 60;
	
	return hour, seconds;


print(equivalent_minute(30));



def vowels(name):

	vowels = ['a', 'o', 'e', 'i', 'u'];
	count = 0;
    
	for vowel_character in name:
		if  vowels[0] == vowel_character:
			count += 1;
		elif vowels[1] == vowel_character:
			count += 1;
            
	return count;

totol_vowels = vowels("pineapple");
print(totol_vowels);


