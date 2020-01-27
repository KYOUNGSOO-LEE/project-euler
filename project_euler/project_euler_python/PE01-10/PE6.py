def sum_squre(n):
    result=0
    for i in range(1, n+1):
        result+=pow(i,2)
    return result

def squre_sum(n):
    sum=0
    for i in range(1,n+1):
        sum+=i
    result=pow(sum,2)
    return result

print(squre_sum(100)-sum_squre(100))