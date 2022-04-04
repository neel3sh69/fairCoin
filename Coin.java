import java.util.Random;

public class Coin {
    int foo() {
        // returning either 0 or 1
        Random r = new Random();
        return r.nextInt(2);
    }

    int toss() {
        int vResult = foo(), vCheck = foo();
        if (vResult != vCheck) // if vResult = 0 and vCheck = 1, or vResult = 1 and vCheck = 0
            return vResult; // i.e., when vResult XOR vCheck = 1, return vResult
        else
            return toss();
    }

    // If you don't know what XOR is:
    //Uncomment lines 20 - 29 to run function XOR
    /*
    boolean XOR(int a, int b) {
        //Consider 0 as false and 1 as true
        boolean A = a != 0;
        boolean B = b != 0;
        //If both are true or both are false, then return false
        //If one is true and one is false, then return true
        return A != B;
    }
    */


    String tossCoin() {
        if (toss() == 0)
            return "Heads";
        else
            return "Tails";
    }
}
