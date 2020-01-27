import time

startTime = time.time()
primes = []
signPrimes = []
for i in range(1, 2 * pow(10, 6) + 2):
    signPrimes.append(1)
signPrimes[0] = 0
signPrimes[1] = 0
signPrimes[2] = 1
for i in range(2, 2 * pow(10, 6) + 1):
    if signPrimes[i] == 1:
        primes.append(i)
        for j in range(1, int(2 * pow(10, 6) / primes[-1])):
            signPrimes[(j + 1) * primes[-1]] = 0
print(sum(primes))
print(time.time() - startTime, "seconds")
