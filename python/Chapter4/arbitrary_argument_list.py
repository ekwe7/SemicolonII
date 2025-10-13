#Arbitrary argument list
def average(*args):
    if len(args) == 0:
        raise TypeError('You must enter at least one argument')
    return sum(args) / len(args)
print(average(4, 8, 18))