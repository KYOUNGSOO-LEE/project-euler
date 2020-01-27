#PE32 Pandigital products
import time
import math

def ispandigit(n):
    nList = list(str(n))
    nList.sort()
    for i in range(0, 9):
        if i + 1 != int(nList[i]):
            return False
    return True

startTime = time.time()
resultList = []
for n in range(0, 2):
    for i in range(10 ** n, 10 ** (n + 1)):
        for j in range(10 ** (3 - n), 10 ** (4 - n)):
            k = i * j
            if k < math.pow(10, 4):
                if ispandigit(int(str(i) + str(j) + str(k))) is True:
                   resultList.append(k)
print(sum(set(resultList)))
print(time.time() - startTime, "seconds")