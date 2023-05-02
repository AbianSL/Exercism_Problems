def square(number):
    count = 1
    if number < 1 or number > 64:
        raise ValueError("square must be between 1 and 64")
    for i in range(number - 1):
        count *= 2
    return count

def total():
    return square(64) 
