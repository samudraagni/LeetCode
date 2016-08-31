import java.lang.String;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        
        int len = s.length();
        char[] vals = s.toCharArray();
        
        for(int i=0, j = len-1; i < len && j >= 0 && i <= j;){
            CharSequence cs = s.substring(i,i+1);
            CharSequence ce = s.substring(j,j+1);
            
            boolean csTrue = isVowel(cs);
            boolean ceTrue = isVowel(ce);
            
            if(csTrue && ceTrue){
                vals[i] = s.charAt(j);
                vals[j] = s.charAt(i);;
                i++;
                j--;
            }
            else if(csTrue && !ceTrue){
                j--;
            }
            else if(!csTrue && ceTrue){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        
        return new String(vals);
        
    }
    
    private boolean isVowel(CharSequence c){
        String vowels = "aeiouAEIOU";
        return vowels.contains(c);
    }
}