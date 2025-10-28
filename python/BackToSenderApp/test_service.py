
import unittest

from my_logistic_service import *

class TestCalculateDailyPayForDispatchRider(unittest.TestCase):

	def test_that_delivery_is_below_50_percent(self):
		expected = logistic_service(1)
		expected2 = logistic_service(15)
		
		self.assertEqual(expected, 5160)
		self.assertEqual(expected2, 5160)
	
	def test_that_delivery_is_greater_than_50_and_less_than_59_percent(self):
		expected = logistic_service(52)
		expected2 = logistic_service(54)
		
		self.assertEqual(expected, 5200)
		self.assertEqual(expected2, 5200)
		
	
	def test_that_delivery_is_greater_than_59_and_less_than_70_percent(self):
		expected = logistic_service(60)
		expected2 = logistic_service(67)
		
		self.assertEqual(expected, 5250)
		self.assertEqual(expected2, 5250)
