public class TwoSumIIInputArrayIsSorted{
    public int[] twoSum(int[] numbers, int target) {
       
        int[] retval = new int[2];
        
        for(int i=0, j=numbers.length-1; i < j; ){
            if(numbers[i] + numbers[j] > target){
                j--;
            }
            else if(numbers[i] + numbers[j] < target){
                i++;
            }
            else{
                retval[0] = i+1;
                retval[1] = j+1;
                break;
            }
        }
        
        return retval;
        
    }
}