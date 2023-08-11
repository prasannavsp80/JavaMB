class NumberZeroExpeption(Exception) :
    def __init__(self, error) :
        self.error = error

class NegativeException(Exception) :
    def __init__(self, error) :
        self.error = error

def add(a,b) :
    if a == 0 or b == 0 :
        raise NumberZeroExpeption("Zero is Invalid value")
    elif a < 0 or b < 0 :
        raise NegativeException("Negative Numbers Not Allowed")
    else :
        c = a+b
        print(c)
try :
    a=int(input("Enter First Number  "))
    b=int(input("Enter Second Number  "))
    add(a,b)
except NumberZeroExpeption as e :
    print(e)
except NegativeException as e :
    print(e)
else :
    print("No Error in Program")
finally :
    print("Program from MB Labs")