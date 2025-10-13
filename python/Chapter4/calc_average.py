def average(*args):
    return sum(args) / len(args)

print(average (15, 30, 45))

def sumNumber(*args):
    total = 0
    for value in args:
        total += value
        return total
    print(sumNumber(15, 30, 45))

def address(**kwargs):
    for value , key in kwargs.items():
        print(f"{value}: {key}")

address(state = "Lagos", country = "Nigeria")

def print_address(*args, **kwargs):
    for arg in args:
        print(arg, end='')

print_address("ekwe", "jude", state = "Lagos", country = "Nigeria", end=' ')