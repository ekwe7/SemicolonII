
def logistic_service(successful_delivery):
	
	daily_delivery = 100;
	base_pay = 5000;
	
	result = (successful_delivery / 100) * 100;
	if (result > 0 and result <= 50):
		rider_commision = 160;
	elif (result > 50 and result <= 59):
		rider_commision = 200;
		
	elif (result >= 60 and result <= 69):
		rider_commision = 250;
	else:
		rider_commision = 500;
		
	return base_pay + rider_commision
	
	
	
	
	