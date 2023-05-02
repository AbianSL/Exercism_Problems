def square(number):
    count = 1 
    for i in range(number - 1):
        count *= 2
    return count

def total():
    return square(64) 
