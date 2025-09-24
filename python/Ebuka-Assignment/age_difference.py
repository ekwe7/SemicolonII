"""
1. collect two input fathers and son's age
2. calcucalte the age difference and store in a variable
3. print result

"""


father_age = int(input("ENter father age between (1-80)"))

son_age = int(input("ENter son age between (1-80)"))

age_difference = (father_age - 2 * son_age)

print(f"the age difference between father and son is {age_difference}")