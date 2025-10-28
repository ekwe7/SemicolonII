import unittest
from my_patrol_dispenser import *

class TestFuelStation(unittest.TestCase):

	def test_that_to_calculate_patrol_by_liter_is_valid(self):
		total, status = calculate_patrol_by_liter("Petrol", 650, 10)
		self.assertEqual(status, "Success")
		self.assertEqual(total, 6500)
		
		
        
	def test_calculate_by_liter_invalid(self):
		total, status = calculate_patrol_by_liter("Diesel", 720, 0)
		self.assertIsNone(total)
		self.assertEqual(status, "Enter a valide range to buy")
		
		
		
	def test_that_calculate_by_amount_is_valid(self):
		liters, status = calculate_patrol_by_amount_per_liter("Diesel", 720, 140)
		self.assertEqual(status, "Success")
		self.assertEqual(liters, 2.0)
		
		