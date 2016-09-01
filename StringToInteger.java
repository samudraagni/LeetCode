public class StringToInteger {
    
    private static final int maxDiv = Integer.MAX_VALUE/10;
    
    public int myAtoi(String str) {
        int i = 0, n = str.length();
    
        /* remove leading white spaces */
        while(i<n && Character.isWhitespace(str.charAt(i)))i++;
        
        /* determine if sign is positive or negative */
        int sign = 1;
        if(i<n){
          if(str.charAt(i) == '+'){
            i++;
          }
          else if(str.charAt(i) == '-'){
            sign *= -1;
            i++;
          }
        }
        
        /* get the number */
        int num = 0;
        while(i < n){
          if(Character.isDigit(str.charAt(i))){
            int digit = Character.getNumericValue(str.charAt(i));
            /* before adding digit to number, check if the number overflows int */
            if(num > maxDiv || num == maxDiv && digit >= 8){
              return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            num = num * 10 + digit;
          }
          else{
              break;
          }
          i++;
        }
        
        return sign * num;
    }
}