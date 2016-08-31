public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int retval = 0;
        int len = s.length();
        
        if(s.contains(" ")){
            String[] p = s.split(" ");
            
            int np = p.length;
            
            if(np > 0){
                retval = p[np-1].length();
            }
        }else{
            retval = len;
        }
        
        return retval;
    }
}