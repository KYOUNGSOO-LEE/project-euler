# PE7 10001st prime
import time
import math

startTime = time.time()
order = 1
num = 1


def is_prime(n):
    if n == 1:
        return False
    elif n == 2:
        return True
    else:
        i = 2
        while i < math.ceil(math.sqrt(n)) + 1:
            if n % i == 0:
                return False
            else:
                i += 1
        return True


while order < 10001:
    num += 2
    if is_prime(num):
        order += 1
    else:
        continue

print(num)
print(time.time() - startTime, "seconds")
