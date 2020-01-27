#PE37 Truncatable primes
import math
import time

def isprime(n):
    if n == 1:
        return False
    else:
        for i in range(2, int(math.sqrt(n)) + 1):
            if n % i == 0:
                return False
        return True

def sieve(n):
    primeList = []
    primeCheck = [1 for i in range(2, n + 1)]
    for i in range(2, n):
        if primeCheck[i - 2] == 1:
            primeList.append(i)
            for j in range(2, int(n // i) + 1):
                primeCheck[i * j - 2] = 0
    return primeList

startTime = time.time()
count = 0
result = 0
primeList = sieve(10 ** 6)

for prime in primeList:
    dig = len(list(str(prime)))
    check = 0
    if dig > 1:
        for i in range(1, dig):
            if isprime(int(str(prime)[i:])) is False:
                check += 1
                break
        if check == 1: continue
        for j in range(1, dig):
            if isprime(int(str(prime)[:-j])) is False:
                check += 1
                break
        if check == 0:
            result += prime
print(result)
print(time.time() - startTime, "seconds")