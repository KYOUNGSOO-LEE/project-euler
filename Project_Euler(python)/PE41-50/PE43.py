#PE43 Sub-string divisibility

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

def swap(s, i, j):
    nList = list(s)
    nList[j], nList[i] = nList[i], nList[j]
    return ''.join(nList)

def undersort(s, i):
    nList = list(s)
    nList = nList[0: i] + sorted(nList[i:])
    return ''.join(nList)

def lexico(nStr):
    lenStr = len(nStr)
    for i in range(lenStr - 2, -1, -1):
        for j in range(lenStr - 1, i, -1):
            if int(nStr[i]) < int(nStr[j]):
                nStr = swap(nStr, i, j)
                nStr = undersort(nStr, i + 1)
                return nStr


startTime = time.time()
nStr = '0123456789'
lenPanList = math.factorial(len(nStr))
primeSet = [2, 3, 5, 7, 11, 13, 17]
panList = [123456789]
check = 0
total = 0
for i in range(1, lenPanList):
    nStr = lexico(nStr)
    panList.append(int(nStr))
for data in panList:
    check = 0
    for i in range(0, 7):
        if int(str(data)[i + 1: i + 4]) % primeSet[i] != 0:
            check = 1
            break
    if check == 0:
        total += data
print(total)
print(time.time() - startTime, "seconds")