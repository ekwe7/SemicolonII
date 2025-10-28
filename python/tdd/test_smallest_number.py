
import unittest
from smallestNumber import smallestNumber

class TestChectSmallestNumber(unittest.TestCase):
	
	def test_that_function_return_smallest_number(self):
	
		my_list = [2, 3, 4, 7, 89, 9, 23]
		result = smallestNumber(my_list)
		self.assertEqual(2, result)
		
	def test_that_function_return_negative_number(self):
	
		my_list = [2, 3, 4, -7, 89, 9, -23, 99, -100]
		result = smallestNumber(my_list)
		self.assertEqual(-100, result)