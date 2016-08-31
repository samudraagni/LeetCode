/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class GuessNumberHigherOrLower extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        
        while(low < high){
            int guessVal = (int) Math.floor((low + (high-low)/2));
            
            int result = guess(guessVal);
            if(result == 0) return guessVal;
            else if(result == -1) high = guessVal - 1;
            else if(result == 1) low = guessVal + 1;
        }
        
        return low;
    }
}