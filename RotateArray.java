public class RotateArray {
    public void rotate(int[] nums, int k) {
        
        int len = nums.length;
        int[] buf = new int[len * 2];
        
        k = k % len;
        
        for(int i=0; i < buf.length; i++){
            buf[i] = nums[i%nums.length];
        }
        
        for(int i=len-k, j=0; j < len; i++, j++){
            nums[j] = buf[i];
        }
    }
}