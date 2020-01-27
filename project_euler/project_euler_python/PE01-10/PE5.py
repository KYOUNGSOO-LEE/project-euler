import time

startTime = time.time()
multiple = 1
temp = 0

for i in range(2, 21):
    for j in range(2, i+1):
        temp = multiple
        while i % j == 0:
            i = i / j
            if temp % j == 0:
                temp = temp / j
            else:
                multiple = multiple * j
print(multiple)
print(time.time() - startTime, "seconds")
