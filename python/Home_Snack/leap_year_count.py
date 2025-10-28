
def leap_year_count(start_year, end_year):

	leap_years = []
	for year in range(start_year, end_year + 1):
		if (year % 4 == 0 and (year % 100 != 0 or year % 400 == 0)):
		
			leap_years.append(year);
	return len(leap_years);

start_year = 1900;
end_year = 2025;
leap_year_count = leap_year_count(start_year, end_year);

print(leap_year_count)