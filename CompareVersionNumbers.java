public class CompareVersionNumbers {
    
    public int compareVersion(String version1, String version2) {
        
        if(version1 == null && version2 == null) return 0;
        if(version1 != null && version2 == null) return 1;
        if(version1 == null && version2 != null) return -1;
        
        String nv1 = version1 + ".0";
        String nv2 = version2 + ".0";
        
        return plainCompare(nv1, nv2);
        
    }
    
    public ArrayList<Integer> extractParts(String str){
        
        ArrayList<Integer> parts = new ArrayList<Integer>();
        String val = "";
        
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == '.'){
                parts.add(Integer.parseInt(val));
                val = "";
                i++;
            }
            val += str.charAt(i);
        }
        parts.add(Integer.parseInt(val));
        
        return parts;
    }
    
    public int plainCompare(String version1, String version2){
        ArrayList<Integer> pv1 = extractParts(version1);
        ArrayList<Integer> pv2 = extractParts(version2);
        
        int i=0, j =0;
        int m = pv1.size()-1;//for the extra zero
        int n = pv2.size()-1;
        
        while(i < m && j < n){
            int v1 = pv1.get(i);
            int v2 = pv2.get(j);
            
            if(v1 < v2) return -1;
            if(v1 > v2) return 1;
            
            i++;
            j++;
        }
        
        while(i < m){
            if(pv1.get(i) != 0){
                return 1;
            }
            i++;
        }
        
        while(j < n){
            if(pv2.get(j) != 0){
                return -1;
            }
            j++;
        }
        
        return 0;
     }
    
}