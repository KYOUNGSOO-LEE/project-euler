import math
import time

start_time=time.time()

for i in range(1,334):
    for j in range(i,500):
        k = math.sqrt(pow(i,2)+pow(j,2))
        if k.is_integer() and i+j+k==1000:
            print(i, j, k, i*j*k)
        else:
            pass

print(time.time() - start_time,"seconds")