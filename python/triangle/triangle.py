def is_triangle(sides):
    for i in range(len(sides)):
        if sides[i] == 0:
            return False
    return sides[0] + sides[1] >= sides[2] and sides[1] + sides[2] >= sides[0] and sides[0] + sides[2] >= sides[1]

def equilateral(sides):
    return sides[0] == sides[1] and sides[1] == sides[2] and is_triangle(sides)

def isosceles(sides):
    if equilateral(sides): 
        return True
    return (sides[0] == sides[1] or sides[1] == sides[2] or sides[0] == sides[2]) and is_triangle(sides)

def scalene(sides):
    return ((sides[0] != sides[1]) and (sides[1] != sides[2]) and (sides[0] != sides[2])) and is_triangle(sides)
