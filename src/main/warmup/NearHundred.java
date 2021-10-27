package main.warmup;

public class NearHundred {
    public boolean nearHundred(int userNum) {
        return Math.abs(userNum - 100) <= 10 || Math.abs(userNum - 200) <= 10;
    }
}
