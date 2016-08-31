public class AddBinary {
    public String addBinary(String a, String b) {
        
        
        int alen = a.length();
        int blen = b.length();
        
        if(alen > blen){
            b = makeLonger(b, alen);
        }
        else if(alen < blen){
            a = makeLonger(a, blen);
        }
        
        alen = a.length();
        blen = b.length();
        
        int[] bvals = new int[blen];
        int[] avals = new int[alen];
        
        for(int i=0; i < alen; i++){
            bvals[i] = b.charAt(i) - '0';
            avals[i] = a.charAt(i) - '0';
        }
        
        return add(avals, bvals);
    }
    
    private String add(int[] a, int[] b){
        
        int cin = 0;
        int sum = 0;
        int cout = 0;
        
        int len = a.length;
        ArrayList<Integer> vals = new ArrayList<Integer>();
        
        int i = len-1;
        while(i >= 0){
            int ac = a[i];
            int bc = b[i];
            
            sum = ac ^ bc ^ cin;
            cout = (ac ^ bc)*cin + (ac * bc);
            
            vals.add(0, sum);
            cin = cout;
            i--;
        }
        
        if(cout == 1) vals.add(0, cout);
        
        StringBuilder sb = new StringBuilder();
        for(Integer c : vals){
            sb.append(c);
        }
        
        return sb.toString();
        
    }
    
    private String makeLonger(String s, int newLen){
        char[] vals = new char[newLen];
        int len = s.length();
        
        int i = newLen-1;
        int j = len-1;
        while(j >= 0){
            vals[i--] = s.charAt(j--);
        }
        
        while(i >= 0){
            vals[i--] = '0';
        }
        
        s = new String(vals);
        
        return s;
    }
}