import java.util.*;

public class MedianFinder {
    
    private ArrayList<Integer> vals;
    private double median;
    
    public MedianFinder(){
        this.vals = new ArrayList<Integer>();
        this.median = 0.0;
    }
    
    private int searchInsert(ArrayList<Integer> A, int target) {
        if(A==null||A.size()==0)
            return 0;
 
        return searchInsert(A,target,0,A.size()-1);
    }
 
    private int searchInsert(ArrayList<Integer> A, int target, int start, int end){
        int mid=(start+end)/2;
 
        if(target==A.get(mid)) 
            return mid;
        else if(target<A.get(mid)) 
            return start<mid?searchInsert(A,target,start,mid-1):start;
        else 
            return end>mid?searchInsert(A,target,mid+1,end):(end+1);
    }

    // Adds a number into the data structure.
    public void addNum(int num) {
        
        //add num in sort of a BST fashion
        int pos = searchInsert(this.vals, num);
        
        this.vals.add(pos, num);
        
       // System.out.println(this.vals.toString());
        
        int size = this.vals.size();
        
        if(size % 2 == 0){
            int mid = size/2;
            int v1 = this.vals.get(mid);
            int v2 = this.vals.get(mid-1);
            this.median = (v1+v2)/2.0;
        }
        else{
            
            int mid = (int)Math.floor(size/2);
            int v1 = this.vals.get(mid);
            this.median = v1 * 1.0;
        }
        
    }

    // Returns the median of current data stream
    public double findMedian() {
        return this.median;
    }
    
    
};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();