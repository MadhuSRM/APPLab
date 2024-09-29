#Impure Function - Example
import random
print("Random Integers:")
for i in range(5):
    print(random.randint(1,100))
    
#Function as argument to another function
def add(a,b):
    return a+b

def sub(a,b):
    return a-b

def mul(x, f):
    y = f(6, 7)
    return x*y

print(f"Higher Order Function - Multiplication:{mul(5,add)}")
print(f"Higher Order Function - Multiplication:{mul(5,sub)}")


#Functional Programming - map
def reverseString(str):
    return str[::-1]

strings = ('Rahul','Madam','Malayalam')
x = list(map(reverseString,strings))
print(f"Reversed Strings:{x}")

#Functional Programming - filter
#Check Prime Number
def isPrimeNumber(n):
    if n==1:
        return False
    elif n==2:
        return True
    else:
        for i in range(2,int(n**0.5)):
            if n % i == 0:
                return False
    return True


primeNumbers = list(filter(isPrimeNumber,range(1,100)))
print(f"Prime Numbers using filter:{primeNumbers}")

#filter and lambda
primeNumbers = list(filter(lambda number: all( number%i != 0 for i in range(2, int(number**.5)+1) ),range(2,100)))
print(f"Prime Numbers Using filter and lambda:{primeNumbers}")

#Functional Programming - reduce
from functools import reduce
numbers = [12, 27, 53, 29, 35]
max_number = reduce(lambda x, y: x if x > y else y, numbers)
print(f"Max Number using reduce and lambda:{max_number}")
