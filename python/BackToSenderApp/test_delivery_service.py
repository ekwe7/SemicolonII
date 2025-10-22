import unittest

from service_delivery import *

Class TestCalculateDailyPayForServices(unittest.TestCase):

	def test_that_delivery_is_below_50_percent(self):
	
		result = service_delivery(2);
		assertEqual(result, 160);