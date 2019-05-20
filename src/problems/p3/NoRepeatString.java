package problems.p3;

public class NoRepeatString {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = s.length(); j > i; j--) {
                String ss = s.substring(i, j);
                boolean status = false;
                for (int k = 0; k < ss.length(); k++){
                    char[] ch = ss.toCharArray();
                    ch[k] = '*';
                    String arr = "";
                    for (int l = 0; l < ch.length; l++){
                        arr += ch[l];
                    }
                    if (arr.contains(ss.substring(k, k+1))){
                        status = true;
                    }
                }
                if (!status){
                    if (ss.length() > length){
                        length = ss.length();
                    }
                }
            }
        }
        return length;
    }
}
