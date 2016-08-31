public class LongestConsevutiveSequence {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length <= 1) return 1;
        
        TreeMap<Integer,Boolean> map = new TreeMap<Integer, Boolean>();
        
        for(Integer i:nums){
            map.put(i,true);
        }
        
        Set<Integer> keys = map.keySet();
        Iterator<Integer> it = keys.iterator();
        int count = 0;
        int maxcount = 0;
        
        int prev = it.next();
        while(it.hasNext()){
            int cur = it.next();
            
            if(Math.abs(cur-prev) == 1){
                count++;
            }
            else{
                count = 0;
            }
            
            if(count > maxcount){
                maxcount = count;
            }
            prev = cur;
        }
        
        
        return maxcount+1;
    }
}