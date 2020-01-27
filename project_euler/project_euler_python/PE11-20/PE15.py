# PE15 Lattice paths
import time


def factorial(n):
    if n == 1:
        return 1
    else:
        return n * factorial(n-1)

start_time = time.time()

print(int(factorial(40)/(factorial(20)*factorial(20))))
print(time.time() - start_time, "seconds")
