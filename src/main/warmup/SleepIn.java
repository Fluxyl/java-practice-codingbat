package main.warmup;

public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
          return true;
        } else {
            return false;
        }
    }
}