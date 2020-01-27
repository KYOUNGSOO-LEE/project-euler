# PE1 Multiples of 3 and 5
import time

start_time = time.time()
sum=0

for i in range(1,1000):
    if i%3==0 or i%5==0:
        sum+=i

print(sum)
print(time.time() - start_time, "seconds")