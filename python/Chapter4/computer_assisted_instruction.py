#script to help an elementary school student learn multiplication

import random
def generate_random_number():
    return random.randint(1, 10), random.randint(1, 10)

def generate_question():
    print("==Welcome to the computer assisted instruction!==\n")
    print('Enter 0 to quit')

while True:
    number1, number2 = generate_random_number()
    correct_answer = number1 * number2

    while True:
        try:
            user_answer = input(f"What is {number1} x {number2}: ")
            if user_answer.strip()== "-1":
                print('can only accept numbers')
            elif user_answer == correct_answer:
                print("Correct!")
            else:
                print("Incorrect answer enter 0 to quit")
        except ValueError:
            print('Enter a valid number')






