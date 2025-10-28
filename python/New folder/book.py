import datetime

prices = {
    "Petrol": 650,
    "Diesel": 720,
    "Kerosene": 550,
    "Gas": 480
}

def show_fuel_options():

    print("Choose fuel type:")
    for index, fuel in enumerate(prices, 1):
        print(f"{index}. {fuel}")

def get_fuel_choice():

    choice = int(input("Enter choice number: "))
    if 1 <= choice <= len(prices):
        fuel_type = list(prices.keys())[choice - 1]
        return fuel_type
    else:
        print("Invalid choice")
        return None

def get_quantity(fuel_type):
    quantity = float(input(f"Enter quantity in liters for {fuel_type}: "))
    return quantity

def calculate_total_cost(price_per_liter, quantity):
    return price_per_liter * quantity


def print_receipt(fuel_type, quantity, price_per_liter, total_cost):
    print("""
----- Receipt -----""")
    print(f"Fuel Type: {fuel_type}")
    print(f"Quantity: {quantity} liters")
    print(f"Price per liter: NGN {price_per_liter}")
    print(f"Total Cost: NGN {total_cost}")
    print(f"Date and Time: {datetime.datetime.now()}")
    print("-------------------")
