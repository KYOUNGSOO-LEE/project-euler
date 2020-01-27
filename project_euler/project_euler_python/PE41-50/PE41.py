#PE41 Pandigital prime
import math
import time

def isprime(n):
    if n == 0 or n == 1:
        return False
    else:
        for i in range(2, n):
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
nStr = '1234567'
cStr = math.factorial(len(nStr))
panList = [1234567]
for i in range(1, cStr):
    nStr = lexico(nStr)
    panList.append(int(nStr))
for i in range(cStr, 1, -1):
    if isprime(panList[i - 1]):
            print(panList[i - 1])
            break
print(time.time() - startTime, "seconds")
