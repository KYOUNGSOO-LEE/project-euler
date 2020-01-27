#PE27 Quadratic primes

import time
import math

def formula(n, a, b):
    return n ** 2 + a * n + b

def isprime(n):
    for i in range(2, math.floor(math.sqrt(abs(n))) + 1):
        if n % i == 0:
            return False
    return True


startTime = time.time()
maxNum = 0
product = 0
aList = [num for num in range(-1000, 1001) if num % 2 == 1]
bList = [num for num in range(-1000, 1001) if isprime(num) is True]
for a in aList:
    for b in bList:
        n = 0
        while(True):
            if isprime(formula(n, a, b)) is False:
                if n > maxNum:
                    maxNum = n
                    product = a * b
                break
            n += 1
print(maxNum, product)
print(time.time() - startTime, "seconds")
