total = 0
count = 0
print("Enter numbers to sum, enter -1 to stop:")
while True:
    num = int(input())
    if num == -1:
        break
    total += num
    count += 1

if count > 0:
    average = total / count
    print("Blast off")
    #print("your average is: " average)
else:
    print("you havn't entered any value")
