public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        
        String[] pieces = str.split(" ");
        if(pieces.length != pattern.length()) return false;
        
        HashMap<Character, String> mapChar = new HashMap<Character, String>();
        HashMap<String, Character> mapStr = new HashMap<String, Character>();
        
        for(int i=0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String val = pieces[i];
            
            
            if(!mapChar.containsKey(c) && !mapStr.containsKey(val)){
                mapChar.put(c, val);
                mapStr.put(val,c);
            }
            else{
                
                if(mapChar.containsKey(c)){
                    String preVal = mapChar.get(c);
                    
                    if(!preVal.equals(val)){
                        return false;
                    }
                }
                
                if(mapStr.containsKey(val)){
                    if(c != mapStr.get(val)){
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}