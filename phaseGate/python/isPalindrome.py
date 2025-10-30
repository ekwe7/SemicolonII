def isPalindrome(number):

	myList = [];
	for num in len(number):
		
		if(num ** num % 2 == 0):
			myList[num] = "true";
		else:
			myList[num] = "false";
			
	return myList;
			
			
int myNumber = [4, 6, 25, 49];
result = isPalindrome(myNumber);
print(result);