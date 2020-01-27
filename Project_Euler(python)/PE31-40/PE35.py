#PE35 Circular primes
import time
import math

startTime = time.time()

def circular(n):
    nStr = str(n)
    return int((nStr[-1] + nStr)[:-1])

def isprime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def iscircularprime(n):
    count = 0
    digit = int(math.log10(n)) + 1
    for i in range(0, digit):
        if isprime(n) is False:
            break
        n = circular(n)
        count += 1
    if count == digit:
        return True

list = []
primeCheck = [1 for i in range(2, 10 ** 6)]
for n in range(2, 10 ** 6):
    if primeCheck[n - 2] == 0:
        continue
    else:
        if iscircularprime(n) is True:
            list.append(n)
        q = (10 ** 6) // n
        for i in range(1, q):
            primeCheck[n * i - 2] == 0
print(len(list))
print(time.time() - startTime, "seconds")