
num1 = (int)(input("Enter number 1: "));
num2 = (int)(input("Enter number 2: "));
num3 = (int)(input("Enter number 3: "));
num4 = (int)(input("Enter number 4: "));


if num1 >= num2 and num1 >= num3 and num1 >= num4:
    largest = num1;
elif num2 >= num1 and num2 >= num3 and num2 >= num4:
    largest = num2;
elif num3 >= num2 and num3 >= num2 and num3 >= num4:
    largest = num3;
else:
    largest = num4;
    

if num2 <= num1 and num2 <= num3 and num2 <= num4:
	secomd_larget = num2;
elif num1 <= num2 and num1 <= num3 and num1 <= num4:
	secomd_larget= num1;
elif num3 <= num1 and num3 <= num2 and num3 <= num4:
	secomd_larget= num3;
else:
	secomd_larget= num4;
	
	
	
mean = secomd_larget + largest;
sum = num1 + num2 + num3 + num4;

median = (sum - mean) // 2;

print(f"median is {median}"); 

print(secomd_larget);
print(largest);



	
	
	
	

