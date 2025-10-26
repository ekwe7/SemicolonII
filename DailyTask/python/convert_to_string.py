
def convert_to_string(words):
    return words.strip().split();


output = convert_to_string("I Love Programming");

print("[", end="");
for index in range(len(output)):
	print(output[index], end="")
	if index < len(output):
		print(", ", end="");
		
print("]");