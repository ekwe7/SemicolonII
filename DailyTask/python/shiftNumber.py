numbers = [4, 0, 2, 0, 1, 0, 3]

for index in range(len(numbers)):
  for count in range(index + 1, len(numbers)):
    if numbers[index] < numbers[count]:
      temp = numbers[index]
      numbers[index] = numbers[count]
      numbers[count] = temp

for number in numbers:
  print(number, end=" ")