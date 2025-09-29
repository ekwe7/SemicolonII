
score1 = input("Enter score 1: ");
score2 = input("Enter score 2: ");
score3 = input("Enter score 3: ");

if score1 >= score2 and score1 >= score3:
    highest = score1;
elif score2 >= score1 and score2 >= score3:
    highest = score2;
else:
    highest = score3;


if(score1 >= score2 and score1 <= score3) or (score1 <= score2 and score1 >= score3):
    second_largest = score1
elif (score2 >= score1 and score2 <= score3) or (score2 <= score1 and score2 >= score3):
    second_largest = score2
else:
    second_largest = score3

print(f"Highest number is: {highest}");
print(f"Second largest number is: {second_largest}");




