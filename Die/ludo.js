function foo() {
    return Math.floor(Math.random() * 6); // returns 1 to 6
}

function roll(){
    const r1 = foo(), r2 = foo(), r3 = foo(), r4 = foo(), r5 = foo(), r6 = foo();
    if (r1 != r2 && r1 != r3 && r1 != r4 && r1 != r5 && r1 != r6 && r2 != r3 && r2 != r4 && r2 != r5 && r2 != r6 && r3 != r4 && r3 != r5 && r3 != r6 && r4 != r5 && r4 != r6 && r5 != r6) 
        return r1;
    else
        return roll();
}

function rollDie() {
    const result = roll();
    if (result == 1) return "one";
    else if (result == 2) return "two";
    else if (result == 3) return "three";
    else if (result == 4) return "four";
    else if (result == 5) return "five";
    else return "six";
}

console.log(rollDie());