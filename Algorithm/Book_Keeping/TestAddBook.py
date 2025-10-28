
import unittest
from book_keeping_app import *


class TestAddBook(unittest.TestCase):

	def test_add_book(self):
		my_books = []
		result = add_book(my_books, 'java')
		self.assertEqual(my_books, ['java'])
		self.assertEqual(result, "Added 'java'")
		
	def test_add_book_empty_title(self):
		my_books = []
		result = add_book(my_books, "")
		self.assertEqual(my_books, [])
		self.assertEqual(result, "Please enter a book")
		






