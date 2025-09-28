import statistics
numbers = [9, 11, 22, 34, 17, 22, 34, 22, 40, 34]

sum(numbers) / len(numbers)
mean = statistics.mean(numbers)

median = statistics.median(numbers)

mode = statistics.mode(numbers)

print(mean)
print(median)
print(mode)
