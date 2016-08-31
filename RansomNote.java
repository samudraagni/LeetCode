public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length()) return false;
        
        int [] mCount = new int[26];
        int [] rCount = new int[26];
        
        Arrays.fill(mCount, 0);
        Arrays.fill(rCount, 0);
        
        for(int i=0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            mCount[c-'a']++;
        }
        
        for(int i=0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            rCount[c-'a']++;
        }
        
        for(int i=0; i < 26; i++){
            int m = mCount[i];
            int r = rCount[i];
            
            if(r != 0){
                if(r > m) return false;
            }
        }
        
        return true;
    }
}