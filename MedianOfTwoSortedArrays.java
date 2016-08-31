import java.util.*;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int n1 : nums1){
            if(!map.containsKey(n1)){
                map.put(n1, 0);
            }
            map.put(n1, map.get(n1)+1);
        }
        for(int n2 : nums2){
            if(!map.containsKey(n2)){
                map.put(n2,0);
            }
            map.put(n2, map.get(n2)+1);
        }
        
        ArrayList<Integer> vals = new ArrayList<Integer>();
        Set<Integer> keys = map.keySet();
        for(int key : keys){
            int numTimes = map.get(key);
            for(int i=0; i < numTimes; i++){
                vals.add(key);
            }
        }
        
        Object[] arr = vals.toArray();
        int len = arr.length;
        int midIndex = len/2;// - 1;//zero based array
        
        if(len % 2 == 0){
            int li = midIndex-1;
            int hi = midIndex;
            int v1 = (int)arr[li];
            int v2 = (int)arr[hi];
            
            double v = (v1+v2)/2.0;
            return v;
        }
        
        return (1.0 * (int)arr[midIndex]);
        
    }
}