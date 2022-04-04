import java.util.Random;
class Flip {
    fun foo(): Int {
        //returning 0 or 1
        val r = Random()
        return r.nextInt(2)
    }
    fun toss(): Int {
        val vResult = foo()
        val vCheck = foo()
        if (vResult != vCheck) // if vResult = 0 and vCheck = 1, or vResult = 1 and vCheck = 0
            return vResult //i.e., when vResult XOR vCheck = 1, return vResult
        else
            return toss()
    }

    /*
    fun XOR(a: Int, b: Int): Boolean {
        val A = a != 0
        val B = b != 0
        return A xor B
    }
    */

    fun tossCoin(): String{
        val vResult = toss()
        return if (vResult == 0) "Heads" else "Tails"
    }
}