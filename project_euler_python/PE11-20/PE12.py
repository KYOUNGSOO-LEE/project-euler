#PE12 Highly divisible triangular number
import time


def divcount(n):
    result = 1
    for i in range(2, int(n / 2) + 1):
        count = 0
        while n % i == 0:
            n /= i
            count += 1
        result *= (count + 1)
        if n == 1:
            break
    if result == 1:
        return 2
    else:
        return result


start_time = time.time()
triangular = 1
i = 2

while divcount(triangular) < 500:
    triangular = triangular + i
    i += 1
print(triangular)
print(time.time() - start_time, "seconds")
