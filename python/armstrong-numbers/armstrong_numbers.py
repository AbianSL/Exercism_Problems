def sum_of_squares(number):
    sum = 0
    size = len(str(abs(number)))
    base = 10
    for i in range(size):
        digit = number % base 
        number /= base 
        sum += digit ** size 
    return sum

def is_armstrong_number(number):
    sum = sum_of_squares(number) 
    if (sum == number):
        return True
    return False 
