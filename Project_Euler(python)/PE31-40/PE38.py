#PE38 Pandigital multiples

import time
import math

def ispandigit(n):
    nList = list(str(n))
    nList.sort()
    for i in range(0, 9):
        if i + 1 != int(nList[i]):
            return False
    return True

def digits(n):
    return int(math.log10(n)) + 1

startTime = time.time()
maximum = 0
for i in range(1, 10 ** 4):
    num = ''
    for n in range(1, 9):
        num = num + str(i * n)
        if digits(int(num)) > 9:
            break
        elif digits(int(num)) == 9 and ispandigit(int(num)) is True:
            if int(num) > maximum:
                maximum = int(num)
print(maximum)
print(time.time() - startTime, "seconds")