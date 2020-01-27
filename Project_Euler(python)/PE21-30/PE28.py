#PE28 Number spiral diagonals

import time

startTime = time.time()
sumDiagonals = 1
i = 1
numFirst = [4 * n ** 2 -2 * n + 1 for n in range(1, 501)]
for n in numFirst:
    subList = [n, n + 2 * i, n + 4 * i, n + 6 * i]
    sumDiagonals += sum(subList)
    i += 1
print(sumDiagonals)
print(time.time() - startTime, "seconds")