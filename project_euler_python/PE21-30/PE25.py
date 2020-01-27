#PE25 1000-digit Fibonacci number
import time

startTime = time.time()
fibo = [1, 1]

while(True):
    fibo.append(fibo[-2] + fibo[-1])
    if len(str(fibo[-1])) > pow(10, 3) - 1:
        break

print(len(fibo))
print(time.time() - startTime, "seconds")