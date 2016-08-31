public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> l = new LinkedList<List<String>>();
        if(strs.length == 0 ) return l;
        
        HashMap<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();
        
        for(String str : strs){
            
            String keyStr = makeKeyStr(str);
            
            //System.out.println(keyStr);
            
            LinkedList a;
            if(!map.containsKey(keyStr)){
                a = new LinkedList<String>();
            }
            else{
                a = map.get(keyStr);
            }
            a.add(str);
            map.put(keyStr,a);
        }
        
        Set<String> keys = map.keySet();
        for(String key : keys){
            LinkedList<String> a = map.get(key);
            //Collections.sort(a);
            l.add(a);
        }
        
        return l;
        
    }
    
    private String makeKeyStr(String str){
        int [] vals = new int[26];
        Arrays.fill(vals, 0);
        
        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            vals[c-'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int v : vals){
            sb.append(v);
            sb.append("x");
        }
        
        return sb.toString();
    }
}