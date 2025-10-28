from book_suggestion import *

#from book_suggestion import add_book, remove_book, update_book, show_books, suggest_book, print_receipt


def my_book():

    books = []
    print("\nWELCOME TO MY BOOK MANAGER ")
    print("==========================")

    while True:
        print("\nWhat would you like to do?")
        print("1. Add a book")
        print("2️. Remove a book")
        print("3️. Update a book")
        print("4️. Show all books")
        print("5️. Suggest a random book")
        print("0. Exit")

        userChoice = input("Enter your choice: ")

        match userChoice:
            case "1":
                title = input("Enter the book title to add: ")
                print(add_book(books, title))

            case "2":
                title = input("Enter the book title to remove: ")
                print(remove_book(books, title))

            case "3":
                old = input("Enter the old title: ")
                new = input("Enter the new title: ")
                print(update_book(books, old, new))

            case "4":
                print(show_books(books))

            case "5":
                print(suggest_book(books))

            case "0":
                print_receipt(books)
                break

            case _:
                print(" Invalid")

my_book()  
