# Score categories.
# Change the values as you see fit.
YACHT = 50 
ONES = 1
TWOS = 2
THREES = 3
FOURS = 4
FIVES = 5
SIXES = 6
FULL_HOUSE = None
FOUR_OF_A_KIND = None
LITTLE_STRAIGHT = None
BIG_STRAIGHT = None
CHOICE = None 

def check_yacht(dices):
    first = dices[0]
    for i in dices:
        if first != i:
            return False
    return True

def check_number(dices, category):
    for i in dices:
        if i == category:
            return True
    return False

def calculate_number(dices, category):
    amount = 0
    for i in dices:
        if i == category:
            amount += 1
    return amount * category

def score(dice, category):
    if category == YACHT and check_yacht(dice):
        return YACHT
    elif check_number(dice, category):
        return calculate_number(dice, category)
    return 0
