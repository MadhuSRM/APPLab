#Reverse Number - while demo
def reverseNumber(num):
    result = temp = 0
    while(num > 0):
        temp = num % 10
        result = result*10 + temp
        num = num//10 #integer division
    return result

#Reverse Words - for demo
def reverseWords(str):
    result = ""
    strArry = str.split();
    for i in range(len(strArry)-1,-1,-1):
        result = result + " "+strArry[i]
    return result

#Recursive Function - Fibonacci 
#if - elif - else demo
def fib(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fib(n-1) + fib(n-2)
    
num1 = int(input("Enter the number to be reversed:"))
print(reverseNumber(num1))

str = input("Enter the words to be reversed:")
print(reverseWords(str))

num2 = int(input("Enter the number:"))
print(fib(num2))
