import random

def suggest_book(books):
    if not books:  
        return "No books available to suggest."
    book = random.choice(books)          
    page = random.randint(1, 100)         
    return f"Book Title: {book}, Page: {page}"


def add_book(books, title):
    if title in books:
        return "Book already exists."
    books.append(title)
    return "Book added successfully!"


def remove_book(books, title):
    if title not in books:
        return "Book not found."
    books.remove(title)
    return "Book removed successfully!"


def update_book(books, old_title, new_title):
    if old_title not in books:
        return "Book not found."
    index = books.index(old_title)  
    books[index] = new_title
    return "Book updated successfully!"


def show_books(books):
    if not books:
        return "No books available."
    result = "All Books:\n"
    for i, book in enumerate(books, 1):  
        result += f"{i}. {book}\n"
    return result.strip()++
