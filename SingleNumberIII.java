public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        
        int xorval = nums[0];
        for(int i=1; i < nums.length; i++){
            xorval = xorval ^ nums[i];
        }
        
        int setXorBit = xorval & ~(xorval-1);
        
        int[] retval = new int[2];
        retval[0] = 0;
        retval[1] = 0;
        
        for(int i=0; i < nums.length; i++){
            if((nums[i] & setXorBit) == 0){
                retval[0] = retval[0] ^ nums[i];
            }
            else{
                retval[1] = retval[1] ^ nums[i];
            }
        }
        
        return retval;
    }
}