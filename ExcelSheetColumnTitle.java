public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder val = new StringBuilder();
        
        while(n != 0){
            int rem = (n-1) % 26;
            n = (n-1)/26;
            
            val.append(Character.toString((char)(rem+'A')));
        }
        
        return val.reverse().toString();
    }
}