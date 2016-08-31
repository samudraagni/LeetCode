public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        
        /* first check if value is power of 2,
        then check if that power is an even number */
        if(num > 0){
            if((num & (num-1)) == 0){
                //num is power of 2
                int val = (int)(Math.log(num)/Math.log(2));
                if(val % 2 == 0) return true;
            }
        }
        
        return false;
    }
}