#PE24 Lexicographic permutations
import time

def swap(s, i, j):
    nList = list(s)
    nList[j], nList[i] = nList[i], nList[j]
    return ''.join(nList)

def undersort(s, i):
    nList = list(s)
    nList1 = nList[0: i]
    nList2 = nList[i:]
    nList2.sort()
    nList = nList1 + nList2
    return ''.join(nList)

def lexico(nStr):
    maxIdx = len(nStr) - 1
    for i in range(maxIdx - 1, -1, -1):
        for j in range(maxIdx, i, -1):
            if int(nStr[i]) < int(nStr[j]):
                nStr = swap(nStr, i, j)
                nStr = undersort(nStr, i + 1)
                return nStr

startTime = time.time()

nStr = '0123456789'
for i in range(pow(10, 6) - 1):
    nStr = lexico(nStr)
print(nStr)
print(time.time() - startTime, "seconds")