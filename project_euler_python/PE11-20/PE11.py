#PE11 Largest product in a grid
f = open("./PE11_number.txt", 'r')
data=[int(num) for num in f.read().split()]
f.close()

import time

mult = 1
mults = []
start_time = time.time()

#Horizontal
for i in range(0, 397):
    if i % 20 < 17:
        mult = 1
        for j in range(0, 4):
            mult *= data[i + j]
        mults.append(mult)

# Verticle
for i in range(0, 340):
    mult = 1
    for j in range(0, 4):
        mult *= data[i + 20 * j]
    mults.append(mult)

# Diagonal
for i in range(0, 337):
    if i % 20 < 17:
        mult = 1
        for j in range(0, 4):
            mult = mult * data[i + 21 * j]
        mults.append(mult)

# Antidiagonal
for i in range(0, 340):
    if i % 20 > 2:
        mult = 1
        for j in range(0, 4):
            mult *= data[i + 19 * j]
        mults.append(mult)

print(max(mults))
print(time.time()-start_time, "seconds")
