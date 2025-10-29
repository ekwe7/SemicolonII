
correctHistory = [];
invalidAnwser = [];

count = 0;
def getQuestionOne(userInput):
      	print("What is the capital of France");
      	if userInput.lower() == "Paris".lower():
      		print("Correct Anwser");
      		count += 1;
      	return correctHistory.append(count);
      
def getQuestionTwo(userInput):
		print("WHat is the capital of Nigeria"),
		if userInput.lower() == "Abuja".lower():
			print("correct");
			count += 1
		return correctHistory.append(count);
			
			
def getQuestionThree(userInput):
		print("what is the capital of lagos");
		if userInput.lower() == "Lagod".lower():
			print("Correct Anwser");
			count += 1;
		return correctHistory.append(count)
	
def getQuestionFour(userInput):
		print("what is the name of Semicolon Chief"),
		if userInput.lower() == "Mr Sam".lower():
			print("correct Anwser");
			count += 1;
				
		return correctHistory.append(count);
			
		


def quizGame():
	prompt = """
==== My Quiz Game =====
1. Question One
2. Question two
3. Question Three
4.Question Four
0. exit

"""
while True:
	userChoice = int(input("Select from Option: "));
	match userChoice:
		case 1: 
			getQuestionOne
		case 2: 
			getQuestionTwo
		case 3:
			getQuestionThree
		case 4:
			getQuestionFour
		case 0:
			print("See you later");
		case _:
			print("Enter a valid input");
	
	
	
	
	

