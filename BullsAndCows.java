public class BullsAndCows {
    public String getHint(String secret, String guess) {
        
        int s, g, size = secret.length();
        int bulls = 0, cows = 0;
        int [] nums = new int [10];
        for (int i = 0; i < size; i++) {
            s = secret.charAt(i) - '0';
            g = guess.charAt(i) - '0';
            if (s == g)
                bulls ++;
            else{
                if (nums[s] < 0)
                    cows++;
                nums[s]++;
                if (nums[g] > 0)
                    cows++;
                nums[g]--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}