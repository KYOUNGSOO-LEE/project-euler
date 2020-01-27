#PE39 Integer right triangles
import time

def ispythatriple(p, i, j):
    if i ** 2 + j ** 2 == (p - (i + j)) ** 2:
        return True
    else:
        return False

startTime = time.time()
maxCount = 0
maxP = 0
for p in range(3, 1001):
    count = 0
    for i in range(1, p // 3 + 1):
        for j in range(i, (p - i) // 2 + 1):
            if ispythatriple(p, i, j) is True:
                count += 1
    if count > maxCount:
        maxCount = count
        maxP = p
print(maxP)
print(time.time() - startTime, "seconds")