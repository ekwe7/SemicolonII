fuels = [
    ["Petrol", 650],
    ["Diesel", 720],
    ["Kerosene", 550],
    ["Gas", 480]
]

transactions = []

def calculate_patrol_by_liter(fuel_type, price_per_liter, liters):
    
	if liters < 1 or liters > 50:
		return None, "Enter a valide range to buy"
	total = liters * price_per_liter
	record_transaction(fuel_type, liters, total)
	return total, "Success"


def calculate_patrol_by_amount_per_liter(fuel_type, price_per_liter, amount):
	if amount < price_per_liter:
		return None, "Amount below price per liter."
	liters = round(amount / price_per_liter, 2)
	record_transaction(fuel_type, liters, amount)
	return liters, "Success"


def record_transaction(fuel_type, liters, total):
	transactions.append([fuel_type, liters, total])

