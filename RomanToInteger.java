public class RomanToInteger {
    
    private Map<Character, Integer> map = 
    new HashMap<Character, Integer>() {{
        put('I', 1); put('V',5); put('X',10);
        put('L',50); put('C',100); put('D',500);
        put('M',1000);
    }};
    
    public int romanToInt(String s) {
        int prev = 0, total = 0;
        
        for(char c : s.toCharArray()){
            int cur = map.get(c);
            
            total += (cur > prev)?(cur-2 * prev) : cur;
            prev = cur;
        }
        
        return total;
    }
}