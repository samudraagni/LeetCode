public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        
        int[] vals = new int[26];
        Arrays.fill(vals,0);
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            vals[c-'a']++;
        }
        
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(vals[c-'a'] == 1) return i;
        }
        
        return -1;
    }
}