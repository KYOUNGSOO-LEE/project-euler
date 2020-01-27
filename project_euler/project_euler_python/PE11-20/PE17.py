#Number letter counts

import time;

startTime = time.time()

Tens = [3, 6, 6, 5, 5, 5, 7, 6, 6]
digits = [3, 3, 5, 4, 4, 3, 5, 5, 4]
teens= [6, 6, 8, 8, 7, 7, 9, 8, 8]

#put 1-19 in list
list = [3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8]
#put 20-99 in list
for i in range(1, 9):
    list.append(Tens[i])
    for j in range(0, 9):
        list.append(Tens[i] + digits[j])
#put 100-999
Hundreds = [10, 10, 12, 11, 11, 10, 12, 12, 11]
for i in range(0, 9):
    list.append(Hundreds[i])
    for j in range(0, 99):
        list.append(Hundreds[i] + 3 + list[j])
#put 1000
list.append(3 + 8)
print(list)
print(sum(list))
endTime = time.time()
print(endTime - startTime, "seconds")
