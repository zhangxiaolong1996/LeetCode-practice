package problems.p3;

/**
 * problem3
 */
public class NoRepeatString {
    public int lengthOfLongestSubstring(String s) {
//        1、简单的思路
        int length = 0;
        int begin = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++){
            for (int j = begin; j < i; j++){
                if (arr[i] == arr[j]){
                    begin = j+1;
                    break;
                }
            }
            if (i - begin + 1 > length){
                length = i - begin + 1;
            }


//      2、一个高消耗内存的写法，虽然也可以执行结果
//            for (int j = s.length(); j > i; j--) {
//                String ss = s.substring(i, j);
//                boolean status = false;
//                for (int k = 0; k < ss.length(); k++){
//                    char[] ch = ss.toCharArray();
//                    ch[k] = '*';
//                    String arr = "";
//                    for (int l = 0; l < ch.length; l++){
//                        arr += ch[l];
//                    }
//                    if (arr.contains(ss.substring(k, k+1))){
//                        status = true;
//                    }
//                }
//                if (!status){
//                    if (ss.length() > length){
//                        length = ss.length();
//                    }
//                }
//            }
        }
        return length;
    }
}
