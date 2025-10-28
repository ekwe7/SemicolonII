import unittest
from book_suggestion import *

import random


class TestBook(unittest.TestCase):

	def test_that_no_books_available(self):
		result = suggest_book([])
		self.assertEqual(result, "No books available")

	def test_that_funtion_return_less_than_three_books(self):
		result = suggest_book(["Book A", "Book B"])
		self.assertEqual(result, "Not enough books")
		
	def test_that_we_can_add_new_book(self):
		books = []
		result = add_book(books, "javaScript")
		self.assertEqual(result, "javaScript added successfully")
		self.assertIn("javaScript", books)
		
		
	def test_that_existing_book_is_not_added_again(self):
		books = ["javaScript"]
		result = add_book(books, "javaScript")
		self.assertEqual(result, " Book already exists")
		self.assertEqual(len(books), 1)
		
		
	def test_that_we_can_remove_exixting_book(self):
		books = ["javaScript", "python", "java"]
		result = remove_book(books, "javaScript")
		self.assertEqual(result, "javaScript removed successfully")
		self.assertTrue("JavaScript" not in books)

		
	
        
        
        
        
        
        