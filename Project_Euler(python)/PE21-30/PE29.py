#PE29 Distinct powers

import time

startTime = time.time()
abList = [a ** b for a in range(2, 101) for b in range(2, 101)]
print(len(set(abList)))
print(time.time() - startTime, "seconds")