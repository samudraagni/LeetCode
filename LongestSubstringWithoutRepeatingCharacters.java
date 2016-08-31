public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int[] charMap = new int[256];
        
        Arrays.fill(charMap, -1);
        
        int i=0, maxLen = 0;
        
        for(int j=0; j < s.length(); j++){
            //System.out.println("before: "+charMap[s.charAt(j)]+" "+s.charAt(j));
            if(charMap[s.charAt(j)] >= i){
                i = charMap[s.charAt(j)] + 1;
            }
            
            //System.out.println("after: "+charMap[s.charAt(j)]+" "+s.charAt(j));
            charMap[s.charAt(j)] = j;
            
            //System.out.println("resetting: "+charMap[s.charAt(j)]+" "+s.charAt(j));
            
            maxLen = Math.max(j-i+1, maxLen);
            //System.out.println("maxLen: "+maxLen);
            //System.out.println("------------------------\n");
        }
        
        return maxLen;
    }
}