# Score categories.
# Change the values as you see fit.
YACHT = 50 
ONES = None
TWOS = None
THREES = None
FOURS = None
FIVES = None
SIXES = None
FULL_HOUSE = None
FOUR_OF_A_KIND = None
LITTLE_STRAIGHT = None
BIG_STRAIGHT = None
CHOICE = None 

def sum(dices):
    sum = 0
    for i in range(dices):
        sum += dices[i]
    return sum

def check_yacht(dices):
    first = dices[0]
    for i in dices:
        if first != i:
            return False
    return True

def score(dice, category):
    if category == YACHT and check_yacht(dice):
        return YACHT
    return 0
