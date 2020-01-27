#PE44 Pentagon numbers
import time
import math

def ispentagon(n):
    if math.sqrt(1 + 24 * n) % 6 == 5:
        return True
    else:
        return False

startTime = time.time()
i = 2
check = 0
pentagonList = [1]

while True:
    pentagon = i * (3 * i - 1) // 2
    for j in pentagonList:
        k = pentagon - j
        if ispentagon(k) and ispentagon(abs(j - k)):
                print(abs(j - k));
                check = 1
                break
    if check:
        break
    else:
        pentagonList.append(pentagon)
        i += 1
print(time.time() - startTime, "seconds")