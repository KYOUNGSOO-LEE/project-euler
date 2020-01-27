# Power digit sum
import time

startTime = time.time()

def factorial(n):
    if n == 1:
        return 1
    else:
        return n * factorial(n-1)

strNum = str(factorial(100))
numList = [int(num) for num in strNum]
print(sum(numList))
print(time.time() - startTime, "seconds")