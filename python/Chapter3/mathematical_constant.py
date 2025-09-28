
#factorial = 1
counter = 1
e = 1.0

accuracy = int(input( "Enter desired accuracy of e: "))

while (counter <= (accuracy - 1)):
    factorial = factorial * counter
    e = e + ( 1 /(factorial))
    counter += 1

print ("Constant e is: ", e)
