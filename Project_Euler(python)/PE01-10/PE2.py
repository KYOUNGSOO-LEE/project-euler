# PE2 Even Fibonacci numbers
import time

i=1
limit=4000000
sum=0
start_time = time.time()

def fibonacci(n):
    if n==1:
        return 1
    elif n==2:
        return 2
    else:
        return fibonacci(n-2)+fibonacci(n-1)

while fibonacci(i)<limit:
    if fibonacci(i)%2==0:
        sum+=fibonacci(i)
    i+=1

print(sum)
print(time.time() - start_time, "seconds")