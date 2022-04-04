import java.util.Random;
public class Die {
    int foo(){
        Random r = new Random();
        return r.nextInt(6) + 1; // returns a random number between 1 and 6
    }
    int roll(){
        int f1 = foo(), f2 = foo(), f3 = foo(), f4 = foo(), f5 = foo(), f6 = foo();
        if (f1 != f2 && f1 != f3 && f1 != f4 && f1 != f5 && f1 != f6 && f2 != f3 && f2 != f4 && f2 != f5 && f2 != f6 && f3 != f4 && f3 != f5 && f3 != f6 && f4 != f5 && f4 != f6 && f5 != f6)
            return f1;
        else
            return roll();
    }

    public String rollDie(){
        int roll = roll();
        if (roll == 1)
            return "one";
        else if (roll == 2)
            return "two";
        else if (roll == 3)
            return "three";
        else if (roll == 4)
            return "four";
        else if (roll == 5)
            return "five";
        else
            return "six";
    }
}
