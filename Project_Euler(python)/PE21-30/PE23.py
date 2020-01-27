#PE23 Non-abundant sums
import time
import math

startTime = time.time()
val = 28123
result = 0
codeSum = []

def isabdt(n):
    listDiv = [1]
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            listDiv.append(i);
            listDiv.append(n // i);
    return sum(set(listDiv))

listAbdt = [num for num in range(1, val + 1) if isabdt(num) > num]

for i in range(0, val + 1):
    codeSum.append(0)
for i in listAbdt:
    for j in listAbdt:
        if i + j <= val:
            codeSum[i + j] = 1
for i in range(1, val + 1):
    if codeSum[i] == 0:
        result += i

print(result)
print(time.time() - startTime, "seconds")