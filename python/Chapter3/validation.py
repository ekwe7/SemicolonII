input1 = 0
input2 = 0
trials = 0
while True:
	trials += 1
	try:
	    user_input = int(input(prompt))
if user_input in [1, 2]:
			return user_input, trials
else:
print("Enter correct number 1 or 2.")
except ValueError:
print("Please enter a number.")

input1, trials1 = get_valid_input("the first input: ")

input2, trials2 = get_valid_input("the second input: ")

total_trials = trials1 + trials2

print(f"\nFirst input: {input1} (trials: {trials1})")
print(f"Second input: {input2} (trials: {trials2})")
print(f"Total trials: {total_trials}")
