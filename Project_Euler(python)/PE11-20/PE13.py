# PE13 Large sum
f = open("./PE13_number.txt",'r')
data = [int(num) for num in f.read().split()]
f.close()

import time
import math

start_time = time.time()

dig = int(math.log(sum(data), 10))+1

print(int(sum(data) / pow(10, dig-10)))
print(time.time() - start_time, "seconds")