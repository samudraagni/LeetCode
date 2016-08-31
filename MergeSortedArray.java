public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int lastIndex = m+n-1;
        int i = m-1;
        int j = n-1;
        
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[lastIndex--] = nums1[i--];
            }
            else if(nums1[i] < nums2[j]){
                nums1[lastIndex--] = nums2[j--];
            }
            else{
                nums1[lastIndex--] = nums1[i--];
                nums1[lastIndex--] = nums2[j--];
            }
        }
        
        while(i >= 0){
            nums1[lastIndex--] = nums1[i--];
        }
        
        while(j >= 0){
            nums1[lastIndex--] = nums2[j--];
        }
    }
}