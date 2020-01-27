# PE21(Amicable numbers)
import time


def div(n):
    return sum([d for d in range(1, n) if n % d == 0])


startTime = time.time()
listAmi = []
for i in range(1, 10001):
    j = div(i)
    k = div(j)
    if i == k and i != j:
        listAmi.append(i)
print(sum(listAmi))
print(time.time() - startTime, "seconds")
