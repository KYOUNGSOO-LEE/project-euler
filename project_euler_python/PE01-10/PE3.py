# PE3 Largest prime factor
import time

start_time = time.time()
num = 600851475143
i = 2

while i < (num / 2) + 1:
    while num % i == 0:
        num = num / i
        if num == 1:
            num = i
            break
    i += 1
print(int(num))
print(time.time() - start_time, "Seconds")