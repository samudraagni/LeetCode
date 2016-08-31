public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        
        int len = nums.length;
        
        if(len == 0) return 1;
        
        TreeSet<Integer> set = new TreeSet<Integer>();
        
        for(int i=0; i < len; i++){
            if(nums[i] >= 0){
                set.add(nums[i]);
            }
        }
        
        for(int i=1; i <= len; i++){
            if(!set.contains(i)) return i;
        }
        
        return set.last()+1;
        
    }
}