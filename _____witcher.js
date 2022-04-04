function foo() {
    return Math.floor(Math.random() * 2); // returns 0 or 1
}

function toss(){
    const result = foo();
    const check = foo();
    if (result != check) return result; // returns result XOR check
    else return toss(); // if result == check, recursive call
}

function tossCoin(){
    const result = toss();
    if (result == 0) return "Heads";
    else return "Tails";
}

function xor(a, b) {
    const A = a!=0;
    const B = b!=0;
    if (A!=B) return true;
    else return false;
}

console.log(tossCoin());