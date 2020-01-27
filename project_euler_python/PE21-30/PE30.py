#PE30 Digit fifth powers
import time

startTime = time.time()
resultList = []
for num in range(10, pow(10, 6)):
    sumDigit = sum([int(i) ** 5 for i in str(num)])
    if int(num) == sumDigit:
        resultList.append(int(num))
print(sum(resultList))
print(time.time() - startTime, "seconds")
