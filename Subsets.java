public class Subsets {
    
    List<List<Integer>> ret;
    int len;
    
    public List<List<Integer>> subsets(int[] nums) {
        
        //Arrays.sort(nums);
        ret = new ArrayList<List<Integer>>();
        len = nums.length;
        
        /* store intermediate values here */
        List<Integer> temp = new ArrayList<Integer>();
        
        helper(len-1, temp, nums);
        
        return ret;
    }
    
    public void helper(int layer, List<Integer> temp, int[] nums){
        if(layer < 0) ret.add(temp);
        else{
            
            //System.out.println("temp: "+temp.toString());
            helper(layer-1, temp, nums);
            
            List<Integer> localtemp = new ArrayList<Integer>(temp);
            localtemp.add(nums[layer]);
            Collections.sort(localtemp);
            
            //System.out.println("localtemp: "+localtemp.toString());
            helper(layer-1, localtemp, nums);
            
            
        }
    }
}