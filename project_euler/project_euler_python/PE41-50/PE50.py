#PE50 Consecutive prime sum
import time
import math

def isprime(n):
    if n == 0 or n == 1:
        return False
    else:
        for i in range(2, int(math.sqrt(n)) + 1):
            if n % i == 0:
                return False
        return True

def seive():
    n = 10 ** 6
    i = 2
    total = 0
    primeList = []
    pcodeList = [1 for i in range(0, n)]
    pcodeList[0] = 0
    while total < 10 ** 6:
        if pcodeList[i - 1] == 1:
            primeList.append(i)
            total += i
            for j in range(2, (n // i) + 1):
                pcodeList[i * j - 1] = 0
        i += 1
    return primeList[0: i - 1]

startTime = time.time()
primeList = seive()
total = 0
maxcount = 0
result = 0
for i in range(len(primeList) - 1):
    total = primeList[i]
    j = i + 1
    while total < 10 ** 6 and j < len(primeList) - 1:
        total += primeList[j]
        if isprime(total) and total < 10 ** 6:
            if j - i + 1 > maxcount:
                maxcount = j - i + 1
                result = total
        j += 1
print(result, maxcount)
print(time.time() - startTime, "seconds")

