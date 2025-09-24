
"""
1. collects three scores from the user
2. calculates the average of the three scores
3. check the statements to determine the grade based on the average score
4. prints grade

"""

score1 = int(input("Enter score from 1 - 100: "));
score2 = int(input("Enter score from 1 - 100: "));
score3 = int(input("Enter score from 1 - 100: "));

average_score = score1 + score2 + score3 / 3;

if(average_score <= 90 and average <= 100):
	grade = "A";
elif (average_score <= 80 and average < 90):
	garde = "B";
elif (average_score <= 70 and average < 80):
	grade = "C";
elif (average_score <= 60 and average < 70):
	grade = "D";
else:
	grade = "F";
	
	
print("grade is ", grade);