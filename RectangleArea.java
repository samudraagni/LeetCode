public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        
        int r1LeftX = A;
        int r1LeftY = B;
        int r1RightX = C;
        int r1RightY = D;
        
        int r2LeftX = E;
        int r2LeftY = F;
        int r2RightX = G;
        int r2RightY = H;
        
        int a = (r1RightX - r1LeftX) * (r1RightY - r1LeftY);
        int b = (r2RightX - r2LeftX) * (r2RightY - r2LeftY);
        
                        /*overlap in length*/                       /*overlap in height*/
        return a + b - overlap(r1LeftX, r1RightX, r2LeftX, r2RightX) * overlap(r2LeftY, r2RightY, r1LeftY, r1RightY);
    }

    private int overlap(int r1Left, int r1Right, int r2Left, int r2Right){
        
        if(r1Right <= r2Left || r2Right <= r1Left){ return 0; }
        
        return Math.min(r1Right, r2Right) - Math.max(r1Left, r2Left);
    }
}