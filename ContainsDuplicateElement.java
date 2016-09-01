public class ContainsDuplicateElement {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int num:nums){
            if(!s.add(num)) return true;
        }
        return false;
    }
}