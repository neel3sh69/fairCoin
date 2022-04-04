import random


def foo():
    # Returns 0 or 1 randomly
    # Assuming probability of 0 is x and that of 1 is 1-x
    return random.randint(0, 1)


def toss():
    vResult = foo()
    vCheck = foo()
    # Returns 0 if vResult is 0 and vCheck is 1. Returns 1 if vResult is 1 and vCheck is 0
    # when vResult XOR vCheck = 1, return vResult
    if vResult != vCheck:
        return vResult
    else:
        return toss()


print("This is the result of tossing a fair coin:")
if toss() == 0:
    print("Heads")
else:
    print("Tails")
