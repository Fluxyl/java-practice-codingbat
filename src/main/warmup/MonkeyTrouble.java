package main.warmup;

public class MonkeyTrouble {
    static public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile || aSmile == false && bSmile == false) {
            return true;
        } else {
            return false;
        }
    }
}
