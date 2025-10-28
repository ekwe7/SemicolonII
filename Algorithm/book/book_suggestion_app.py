import random
from datetime import datetime

class BookManager:
    def _init_(self):
        self.books = []

    def add_book(self):
        book = input("Enter new book title to add: ").strip()
        if book:
            self.books.append(book)
            print(f"Book '{book}' added.")
        else:
            print("Empty title not allowed.")

    def remove_book(self):
        if not self.books:
            print("No books to remove.")
            return
        self.show_books()
        try:
            index = int(input("Enter book number to remove: "))
            if 1 <= index <= len(self.books):
                removed = self.books.pop(index - 1)
                print(f"Book '{removed}' removed.")
            else:
                print("Invalid book number.")
        except ValueError:
            print("Please enter a valid number.")

    def suggest_book(self):
        if not self.books:
            print("No books available for suggestion.")
            return
        print("Suggesting up to 10 random books:")
        suggestions = random.sample(self.books, min(10, len(self.books)))
        for i, suggestion in enumerate(suggestions, 1):
            print(f"{i}. {suggestion}")

    def show_books(self):
        if self.books:
            print("Books available:")
            for i, book in enumerate(self.books, 1):
                print(f"{i}. {book}")
        else:
            print("No books available.")

