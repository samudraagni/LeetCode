public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> retval = new ArrayList<>();
        
        List<Integer> cur, prev = null;
        
        for(int i=0; i < numRows; i++){
            cur = new ArrayList<Integer>();
            
            for(int j=0; j <= i; j++){
                if(j == 0 || j == i){
                    cur.add(1);
                }
                else{
                    cur.add(prev.get(j-1) + prev.get(j));
                }
            }
            
            prev = cur;
            retval.add(prev);
        }
        
        return retval;
    }
}