
parking_lot = {

    "slotNumber1": {"carNumber": 0},
    "slotNumber2": {"carNumber": 0},
    "slotNumber3": {"carNumber": 0},
    "slotNumber4": {"carNumber": 0},
    "slotNumber5": {"carNumber": 0},
    "slotNumber6": {"carNumber": 0},
    "slotNumber7": {"carNumber": 0},
    "slotNumber8": {"carNumber": 0},
    "slotNumber9": {"carNumber": 0},
    "slotNumber10": {"carNumber": 0},
    "slotNumber11": {"carNumber": 0},
    "slotNumber12": {"carNumber": 0},
    "slotNumber13": {"carNumber": 0},
    "slotNumber14": {"carNumber": 0},
    "slotNumber15": {"carNumber": 0},
    "slotNumber16": {"carNumber": 0},
    "slotNumber17": {"carNumber": 0},
    "slotNumber18": {"carNumber": 0},
    "slotNumber19": {"carNumber": 0},
    "slotNumber20": {"carNumber": 0}
    
    
}


def my_car_park(car_number):

	for index in parking_lot:
		if parking_lot[index]["carNumber"] == 0:
			parking_lot[index]["carNumber"] = car_number;
			print(f"Car {car_number} parked here");
		else:
			print("Not Slot available Chief")



def leaveCarSlot(carSlotNumber):

	if (parkingLot[carSlotNumber] and parkingLot[carSlotNumber].carNumber != 0):

		print(f"Car {parkingLot[eachSlot].carNumber} left {carSlotNumber}");
		parkingLot[carSlotNumber].carNumber = 0;

	else:
		return "car slot is already empty";



