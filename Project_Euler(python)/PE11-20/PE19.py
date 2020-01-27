# Counting Sunday
import time

startTime = time.time()
days = 1
count = 0
for year in range(1900, 2001):
    for month in range(1, 13):
        if month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12:
            days += 31
        elif month == 4 or month == 6 or month == 9 or month == 11:
            days += 30
        elif month == 2 and year % 4 == 0 and year != 1900:
            days += 29
        else:
            days += 28
        if days % 7 == 0 and year > 1900:
            count += 1
print(count)
print(time.time() - startTime, "seconds")