"""
1. collect two input fathers and son's age
2. calcucalte the age difference and store in a variable
3. check if age is greater than 80 or less than one
4. print result

"""


father_age = int(input("ENter father age between (1-80)"));

son_age = int(input("ENter son age between (1-80)"));

age_difference = (father_age - 2 * son_age);

if(father_age < 1 or father_age > 80 or son_age < 1 or son_age > 80):
	print("Invalid enter age between (1-80)");



print(f"the age difference between father and son is {age_difference}");