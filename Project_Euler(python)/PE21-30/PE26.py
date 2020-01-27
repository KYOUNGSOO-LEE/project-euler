#PE26 Reciprocal cycles
import time

def remainder(i, r):
    return 10 * r % i

startTime = time.time()
sizeCycle = []
for i in range(2, 1000):
    remainders = [1]
    while(True):
        remainders.append(remainder(i, remainders[-1]))
        if remainders[-1] in remainders[0: -1] or remainders[-1] == 0:
            sizeCycle.append(len(remainders))
            break
print(sizeCycle.index(max(sizeCycle)) + 2)
print(time.time() - startTime, "seconds")