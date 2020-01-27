#PE47 Distinct primes factors
import time

def numprimefactor(n, l):
    count = 0
    for i in l:
        if n % i == 0:
            count += 1
        while n % i == 0:
            n /= i
            if n == 1:
                return count
        i += 1

def seive(n):
    i = 2
    primecodeList =[1 for i in range(1, n + 1)]
    primecodeList[0] = 0
    primeList = []
    while i < n + 1:
        if primecodeList[i - 1] == 1:
            primeList.append(i)
            for j in range(2, n // i + 1):
                primecodeList[i * j - 1] = 0
        i += 1
    return primeList

startTime = time.time()
i = 2
count = 0
primeList = seive(10 ** 3)
while True:
    if numprimefactor(i, primeList) == 4:
        count += 1
        if count == 4:
            break
    else:
        count = 0
    i += 1
print (i - 3)
print(time.time() - startTime, "seconds")
