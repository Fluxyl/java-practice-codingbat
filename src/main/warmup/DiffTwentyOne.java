package main.warmup;

public class DiffTwentyOne {
    public static int diffTwentyOne(int n) {
        if (n > 21) {
            return((n - 21) * 2);
        } else {
            return(Math.abs(n - 21));
        }
    }
}
