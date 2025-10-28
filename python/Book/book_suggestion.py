import random
import time


def suggest_book(books):
	if not books:
		return "No books available"
    
	if len(books) < 3:
		return "Not enough books"
	suggestions = random.sample(books, 1)
    
	result = "\nSuggested Books\n"
	result += "=============\n"
	number = 1
	
	for book in suggestions:
		result += str(number) + ". " + book + "\n"
		number += 1
	return result
	


def add_book(books, title):
	if title in books:
		return " Book already exists"
			
	books.append(title)
	return title + " added successfully"


def remove_book(books, title):

	if title not in books:
		return " Book not found."
	books.remove(title)
	return title + " removed successfully"



def update_book(books, old_title, new_title):
    
	if old_title not in books:
		return "Book not found."
	index = books.index(old_title)
	books[index] = new_title
	return old_title + "' updated to '" + new_title + "'."


def show_books(books):
	if not books:
		return "No books available."
	result = "\nYour Book List\n"
	#result += "===============\n"
	number = 1
	
	
	for book in books:
		result += str(number) + ". " + book + "\n"
		number += 1
	return result


def print_receipt(books):

	print("\n=============================")
	print("CUSTOMER READING RECEIPT")
	print("===========================")
	if not books:
		print("You have no saved books yet")
	else:
		for book in books:
			print("Book Title : " + book)
		print("Total Books : " + str(len(books)))
		for count in range(1):
			print(".", end="", flush=True)
			time.sleep(0.3)







