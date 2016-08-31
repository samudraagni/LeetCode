public class BitwiseANDOfNumbersRange {
    
    public int rangeBitwiseAnd(int m, int n) {
        
        for(int i=0; i < 31; i++){
         int val = (int)Math.pow(2,i);
         
         if(m < val && n > val) return 0;
         
         if(n == val && m <= n-1) return 0;
        }
        
        /* aft handling all false cases, get to the true value */
        int retval = m;
        for(int i=m; i <= n; i++){
            retval = retval & i;
            if(i == Integer.MAX_VALUE) break;
        }
        
        
        
        return retval;
    }
}