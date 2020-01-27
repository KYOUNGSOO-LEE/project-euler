#PE45 Triangular, pentagonal, and hexagonal
import time
import math

def ispentagon(n):
    if math.sqrt(1 + 24 * n) % 6 == 5:
        return True

def ishexagon(n):
    if math.sqrt(1 + 8 * n) %  4 == 3:
        return True

startTime = time.time()
i = 286
while True:
    trialge = i * (i + 1) // 2
    if ispentagon(trialge) and ishexagon(trialge):
        break
    else:
        i += 1
print(trialge)
print(time.time() - startTime, "seconds")