# Maximum path sum I
import time

startTime = time.time()
f = open("./PE18_number.txt", 'r')
dataList = [int(num) for num in f.read().split()]
f.close()
maxValue = 0
for i in range(0, 16384):
    product = dataList[0]
    orderGroup = 1
    indexSubGroup = 0
    for j in range(0, 14):
        if i % 2 == 0:
            orderGroup += 1
            indexSubGroup = indexSubGroup + 0
            product += dataList[int(orderGroup * (orderGroup - 1) / 2) + indexSubGroup]
            i //= 2
        else:
            orderGroup += 1
            indexSubGroup = indexSubGroup + 1
            product += dataList[int(orderGroup * (orderGroup - 1) / 2) + indexSubGroup]
            i //= 2
    if product > maxValue:
        maxValue = product
print(maxValue)
print(time.time() - startTime, "seconds")
