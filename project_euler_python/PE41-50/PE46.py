#PE46 Goldbach's other conjecture
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

def issqaure(n):
    if int(math.sqrt(n)) == math.sqrt(n):
        return True

startTime = time.time()
i = 1
check = 0
primeList = [2]
while True:
    check = 0
    oddComposite = 2 * i + 1
    if isprime(oddComposite):
        primeList.append(oddComposite)
        check = 1
    else:
        for prime in primeList:
            if issqaure((oddComposite - prime) // 2):
                check = 1
                break
    if check == 0:
        print(oddComposite)
        break
    else:
        i += 1
print(time.time() - startTime, "seconds")