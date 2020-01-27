#PE34 Digit factorials
import time
import math

startTime = time.time()
result = 0
for n in range(3, 10 ** 7):
    nList = list(str(n))
    sumFact = 0
    for num in nList:
        sumFact += math.factorial(int(num))
        if n == sumFact:
            result += n
print(result)
print(time.time() - startTime, "seconds")