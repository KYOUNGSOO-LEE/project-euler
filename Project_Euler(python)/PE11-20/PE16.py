# Power digit sum
import time

startTime = time.time()

strNum = str(pow(2,1000))
numList = [int(num) for num in strNum]
print(sum(numList))

endTime = time.time()
print(endTime - startTime, "seconds")