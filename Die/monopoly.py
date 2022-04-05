import random


def foo():
    return random.randint(0, 6) + 1


def roll():
    r1 = foo()
    r2 = foo()
    r3 = foo()
    r4 = foo()
    r5 = foo()
    r6 = foo()
    if r1 != r2 and r1 != r3 and r1 != r4 and r1 != r5 and r1 != r6 and r2 != r3 and r2 != r4 and r2 != r5 and r2 != r6 and r3 != r4 and r3 != r5 and r3 != r6 and r4 != r5 and r4 != r6 and r5 != r6:
        return r1
    else:
        return roll()


def rollDie():
    r = roll()
    if r == 1:
        return "one"
    elif r == 2:
        return "two"
    elif r == 3:
        return "three"
    elif r == 4:
        return "four"
    elif r == 5:
        return "five"
    else:
        return "six"


print(rollDie())
