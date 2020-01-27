#PE14 Longest Collatz sequence
import time

start_time = time.time()
lenChain = []

for num in range(2, pow(10, 6)):
    i = 0
    while num > 1:
        i += 1
        if num % 2 == 0:
            num /= 2
        else:
            num = 3 * num + 1
    lenChain.append(i)
print(lenChain.index(max(lenChain))+2)
print(time.time() - start_time, "seconds")