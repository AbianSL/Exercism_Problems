# Score categories.
# Change the values as you see fit.
YACHT = 50 
ONES = 1
TWOS = 2
THREES = 3
FOURS = 4
FIVES = 5
SIXES = 6
FULL_HOUSE = 40 
FOUR_OF_A_KIND = 35 
LITTLE_STRAIGHT = 20 
BIG_STRAIGHT = 30 
CHOICE = 25 

def sum(dices):
    sum = 0
    for i in dices:
        sum += i
    return sum

def sum_same_kind(dices):
    sum = 0
    first = dices[0] 
    count = 0
    for i in dices:
        if count > 3:
            break
        
        if first == i:
            count += 1
            sum += i
    return sum

def check_full_house(dices):
    first = dices[0]
    second = dices[1]
    third = dices[2]
    count = 0
    count_second = 0
    count_third = 0
    for i in dices:
        if i == first:
            count += 1
        elif i == second:
            count_second += 1
        elif i == third:
            count_third += 1
    if count != 3 and count_second != 3 and count_third != 3:
        return False
    return True

def check_straight(dices, category):
    list = [1, 2, 3, 4, 5]
    if category == BIG_STRAIGHT:
        list = [2, 3, 4, 5, 6]
    check_list = [False, False, False, False, False]
    for i in dices:
        if not i in list:
            return False
        if category == BIG_STRAIGHT:
            check_list[i - 2] = True
        else:
            check_list[i - 1] = True
    if is_all_true(check_list):
        return True
    return False

def is_all_true(list):
    for i in list:
        if i == False:
            return False
    return True

def check_four_kind(dices):
    first = dices[0]
    count = 0
    for i in dices:
        if first != i and count == len(dices) - 1:
            return False
        count += 1
    return True

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
    elif check_straight(dice, category):
        return 30
    elif category == CHOICE:
        return sum(dice)
    elif category == FOUR_OF_A_KIND and check_four_kind(dice):
        return sum_same_kind(dice)
    elif category == FULL_HOUSE and check_full_house(dice):
        return sum(dice) 
    return 0
