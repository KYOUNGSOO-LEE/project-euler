#PE49 Prime permutations
import time
import math

def seive(n):
    i = 2
    primecodeList =[1 for i in range(1, n + 1)]
    primecodeList[0] = 0
    primeList = []
    while i < n + 1:
        if primecodeList[i - 1] == 1:
            for j in range(2, n // i + 1):
                primecodeList[i * j - 1] = 0
            if math.log10(i) > 3:
                primeList.append(i)
        i += 1
    return primeList

def ispermutation(i, j):
    stri = sorted(str(i))
    strj = sorted(str(j))
    if stri == strj:
        return True

startTime = time.time()
primeList = seive(10 ** 4)
for i in range(0, len(primeList)):
    for k in range(0, i):
        if ispermutation(primeList[i], primeList[k]):
            j = (primeList[i] + primeList[k]) // 2
            if j in primeList and ispermutation(primeList[i], j):
                print(str(primeList[k]) + str(j) + str(primeList[i]))
print(time.time() - startTime, "seconds")
