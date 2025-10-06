

def my_discount(price, discount):
	total = discount / 100 * price;
	
	output_after_discount = price - discount;
	return output_after_discount;
	
price = float(input("Enter goods price: "));
discount = float(input("Enter the discount: "));

final_total = my_discount(price, discount);

print(final_total);