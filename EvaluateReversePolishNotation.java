public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<Integer>();
        String ops = "+-*/";
        
        for(int i=0; i < tokens.length; i++){
            String op = tokens[i];
            
            if(ops.contains(op)){
                if(!st.isEmpty()){
                    int b = st.pop();
                    if(!st.isEmpty()){
                        int a = st.pop();
                        int val = getAnswer(a, b, op);
                        st.push(val);
                    }
                }    
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        
        return st.peek();
    }
    
    private int getAnswer(int a, int b, String op){
        if(op.equals("+")) return a+b;
        if(op.equals("-")) return a-b;
        if(op.equals("*")) return a*b;
        if(op.equals("/") && b!=0) return a/b;
        return 0;
    }
}