#PE42 Coded triangle numbers
import time

startTime = time.time()
f = open("./PE42_words.txt", 'r')
dataSet = [strWord[1: -1] for strWord in f.read().split(",")]
f.close()

count = 0
triNumList = [int(0.5 * n * (n + 1)) for n in range(1, 100)]

for data in dataSet:
    lenData = len(data)
    sumAscii = 0
    for i in range(lenData):
        sumAscii += ord(data[i]) - 64
    if sumAscii in triNumList:
        count += 1
print(count)
print(time.time() - startTime, "seconds")