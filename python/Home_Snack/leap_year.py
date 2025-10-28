def leap_years(start_year, end_year):

	leap_years = []
	for count in range(start_year, end_year + 1):
		if count % 4 == 0 and (count % 100 != 0 or count % 400 == 0):
			leap_years.append(count);
	
	return len(leap_years)

start_year = 1900
end_year = 2025
result = leap_years(start_year, end_year)

print(result);