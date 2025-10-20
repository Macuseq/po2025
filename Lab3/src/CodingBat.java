public class CodingBat {
    //warmup
    //sleepIn
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) return true;
        else return false;
    }
    //monkeyTrouble
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) return true;
        else return false;
    }
    //countEvens
    public int countEvens(int[] nums) {
        int ile = 0;
        for (int i : nums){
            if (i % 2 == 0) ile++;
        }
        return ile;
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }


}
