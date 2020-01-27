import time

start_time = time.time()
product=0; result=0; num=[]

for i in range(100, 1000):
    for j in range(100, 1000):
        product=i*j
        num=str(product)

        if num==num[::-1]:
            if product>result:
               result=product

print(result)
print(time.time() - start_time, "seconds")