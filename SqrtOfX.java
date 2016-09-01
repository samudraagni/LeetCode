public class SqrtOfX {
    public int mySqrt(int x) {
        if(x <= 0) return x;
        int low = 1, high = x/2;
        while (low < high){
            int mid = low + (high - low) / 2;
            if(mid == x/mid) {low = mid; break;} 
            else if(mid > x/mid) high = mid;
            else if(mid < x/mid && (mid+1) <= x/(mid+1)) low = mid + 1;
            else if(mid < x/mid && (mid+1) > x/(mid+1)) {low = mid; break;}
        }
        return low;
        
    }
}