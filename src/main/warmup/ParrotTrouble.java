package main.warmup;

public class ParrotTrouble {
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (!talking) {
            return false;
        }

        else if (talking && (hour < 7 || hour > 20)) {
            return true;
        } 
        
        else {
            System.out.println("Something went wrong.");
            return false;
        }
    }
}
