public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] retval = new int[2];
        
        for(int i=0; i < nums.length; i++){
            int x = nums[i];
            if(map.containsKey(target - x)){
                retval[0] = map.get(target-x);
                retval[1] = i;
                break;
            }
            map.put(x,i);
        }
        
        return retval;
    }
}