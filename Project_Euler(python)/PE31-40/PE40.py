#PE40 Champernowne's constant
import time

startTime = time.time()
digitList = []
orderList = [1, 10, 10 ** 2, 10 ** 3, 10 ** 4, 10 ** 5, 10 ** 6]
product = 1

for n in range(1, 10 ** 6):
    numList = list(str(n))
    for num in numList:
        digitList.append(int(num))

for order in orderList:
    product *= digitList[order - 1]

print(product)
print(time.time() - startTime, "seconds")
