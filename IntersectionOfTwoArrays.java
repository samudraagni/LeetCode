public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        if(nums1.length == 0 ) return nums1;
        if(nums2.length == 0) return nums2;
        
        Set<Integer> vals = new HashSet<Integer>();
        Set<Integer> common = new HashSet<Integer>();
        
        for(int num1 : nums1){
            vals.add(num1);
        }
        
        for(int num2 : nums2){
            if(vals.contains(num2)){
                common.add(num2);
            }
        }
        
        int n = common.size();
        int[] ret = new int[n];
        int i = 0; 
        for(int c: common){
            ret[i] = c;
            i++;
        }
        
        return ret;
        
    }
}