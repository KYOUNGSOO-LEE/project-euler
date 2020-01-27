#PE36 Double-base palindromes
import math
import time

def ispalindrome10(n):
    dig = int(math.log10(n)) + 1
    nStr = str(n)
    for i in range(0, int(dig / 2)):
        if nStr[i] != nStr[dig - 1 - i]:
            return False
    return True

def ispalindrome2(n):
    list = []
    while(True):
        list.append(n % 2)
        n = n // 2
        if n == 0:
            break
    dig = len(list)
    for i in range(0, dig):
        if list[i] != list[dig - 1 - i]:
            return False
    return True

startTime = time.time()
sumPalindrome = 0
for n in range(1, 10 ** 6):
    if ispalindrome10(n) is True:
        if ispalindrome2(n) is True:
            sumPalindrome += n
print(sumPalindrome)
print(time.time() - startTime, "seconds")
