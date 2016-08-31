public class PowerOfThree {
    
    private final int largestIntPowerOfThree = 1162261467;
    
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        
        if(largestIntPowerOfThree % n == 0){
            return true;
        }
        
        return false;
    }
}