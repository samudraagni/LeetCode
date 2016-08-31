public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String pre = countAndSay(n - 1);
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(i < pre.length()) {
            int num = 1;
            while(i < pre.length() - 1 && pre.charAt(i) == pre.charAt(i + 1)) {
                num++;
                i++;
            }   
            res.append(String.valueOf(num)).append(pre.charAt(i));
            i++;
        }
        return res.toString();
    }
}