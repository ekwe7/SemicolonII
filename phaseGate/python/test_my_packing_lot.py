
import unittest

from my_packing_lot import *


class TestMyCarPark(unittest.TestCase):

    def setUp(self):
        for key in parking_lot:
            parking_lot[key]["carNumber"] = 0


    def test_that_pack_exist(self):
        my_car_park("1234")
        self.assertEqual(parking_lot["slotNumber1"]["carNumber"], "1234")


    def test_that_next_car_packs_in_next_slot(self):
        my_car_park("1234")
        my_car_park("5678")
        self.assertEqual(parking_lot["slotNumber1"]["carNumber"], "1234")
        self.assertEqual(parking_lot["slotNumber2"]["carNumber"], "5678")


    def test_that_car_parks_in_first_available_slot(self):
        parking_lot["slotNumber1"]["carNumber"] = "already parked"
        my_car_park("1234")
        self.assertEqual(parking_lot["slotNumber2"]["carNumber"], "1234")