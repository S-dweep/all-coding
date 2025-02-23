points=(4,10,7,3)
print(type(points))
print(points[1])
# points[0]=5 cannot be done in tuples
# tuples are immutable

def add_mul(a,b):
    s=a+b
    m=a*b
    return s,m

sum,mul=add_mul(5,10)
print(sum)
print(mul)