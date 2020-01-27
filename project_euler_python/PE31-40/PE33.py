#PE33 Digit cancelling fractions
import time
import math

startTime = time.time()
numerator = 1
denominator = 1
for i in range(11, 100):
    for j in range(10, i):
        for n in range(0, 2):
            if int(list(str(j))[1 - n]) == int(list(str(i))[n]) and int(list(str(i))[1 - n]) != 0:
                if int(list(str(j))[n]) / int(list(str(i))[1 - n]) == j / i:
                    numerator *= j
                    denominator *= i
denominator /= math.gcd(numerator, denominator)
print(denominator)
print(time.time() - startTime, "seconds")