package dies

import java.util.*

class snakNladr {
    fun foo(): Int {
        val r = Random()
        return r.nextInt(6) + 1 // returns a random number between 1 and 6
    }

    fun roll(): Int {
        val f1 = foo()
        val f2 = foo()
        val f3 = foo()
        val f4 = foo()
        val f5 = foo()
        val f6 = foo()
        return if (f1 != f2 && f1 != f3 && f1 != f4 && f1 != f5 && f1 != f6 && f2 != f3 && f2 != f4 && f2 != f5 && f2 != f6 && f3 != f4 && f3 != f5 && f3 != f6 && f4 != f5 && f4 != f6 && f5 != f6)
            f1
        else
            roll()
    }

    fun rollDie(): String {
        val roll = roll()
        return if (roll == 1)
            "one"
        else if (roll == 2)
            "two"
        else if (roll == 3)
            "three"
        else if (roll == 4)
            "four"
        else if (roll == 5)
            "five"
        else
            "six"
    }
}