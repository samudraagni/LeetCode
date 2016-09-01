public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        int[] newdigits = new int[digits.length+1];
        int i;
        for(i = newdigits.length-1; i>0; i--){
            newdigits[i] = digits[i-1];
        }
        newdigits[i] = 1;
        
        return newdigits;
    }
}