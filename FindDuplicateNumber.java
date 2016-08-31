public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<Integer>();
        int retval = nums[0];
        for(int i:nums){
            if(!map.add(i)){
                retval= i;
                break;
            }
        }
        return retval;
    }
}