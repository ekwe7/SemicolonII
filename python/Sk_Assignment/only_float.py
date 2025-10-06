
def only_float(a, b):
    if isinstance(a, float) and isinstance(b, float):
        return 2
    elif isinstance(a, float) or isinstance(b, float):
        return 1
    else:
        return 0


number1 = float(input("Enter number one: "));
number2 = float(input("Enter number two: "));
output = number1, number2

print(output);
