#PE48 Self powers
import time

def selfpower(n):
    product = 1
    for i in range(1, n + 1):
        product = (product * n) % (10 ** 10)
    return product

startTime = time.time()
result = 0
for i in range(1, 1000):
    result += selfpower(i)
    result = result % (10 ** 10)
print(result)
print(time.time() - startTime, "seconds")