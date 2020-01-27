#PE31 Coin sums
import time

startTime = time.time()

def func(change, coins, k):
    if change - k * coins[0] == 0:
        return 1
    elif change - k * coins[0] > 0 and len(coins) == 2:
        return 1
    elif change - k * coins[0] < 0:
        return 0
    else:
        return sum(func(change - k * coins[0], coins[1:], l) for l in range(0, (change - k * coins[0]) // coins[1] + 1))

coins = [200, 100, 50, 20, 10, 5, 2, 1]
print(func(200, coins, 0) + func(200, coins, 1))
print(time.time() - startTime, "seconds")