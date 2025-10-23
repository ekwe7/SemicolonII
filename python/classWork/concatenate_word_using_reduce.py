
from functools import reduce

myList = ["I", "Love", "Python", "Snacks"];

def concatenate_word_using_reduce(words, word):
	mark = "-";
	return words + mark + word;
	
	
result = reduce(concatenate_word_using_reduce, myList);
print(result);