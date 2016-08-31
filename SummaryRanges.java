public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> vals = new LinkedList<String>();
        
        if(nums.length == 0) return vals;
        
        int start = nums[0];
        int diff = 0, i;
        for(i=1; i < nums.length;i++){
            diff = nums[i]-nums[i-1];
            if(diff != 1){
                if(start != nums[i-1]){
                    String v = start+"->"+nums[i-1];
                    vals.add(v);    
                }else{
                    String v = String.valueOf(start);
                    vals.add(v);
                }
                start = nums[i];
            }
        }
        
        if(diff == 1){
            String v = start+"->"+nums[i-1];
            vals.add(v);    
        }
        else{
            vals.add(String.valueOf(start));
        }
        
        return vals;
    }
}