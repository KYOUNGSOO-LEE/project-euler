#PE11 Largest product in a grid
import time

startTime = time.time()

f = open("./PE22_names.txt", 'r')
dataSet=[strName[1:-1] for strName in f.read().split(",")]
f.close()

dataSet.sort()

sum = 0
for idx1 in range(0, len(dataSet)):
    lenName = len(dataSet[idx1])
    value = 0
    for idx2 in range(0, lenName):
        value += ord(dataSet[idx1][idx2])-64
    sum += value * (idx1 + 1)
print(sum)
print(time.time() - startTime, "seconds")