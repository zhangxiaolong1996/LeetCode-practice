package problems.p9;

/**
 * 回文数解法
 * 1、转化成char数组折半匹配
 * 2、每次除以10取余数然后给原数除以10，余数乘以10相加比较
 */

public class Palindrome {
    private static Palindrome instance = new Palindrome();

    public static Palindrome getInstance(){
        if (instance == null){
            instance = new Palindrome();
        }
        return instance;
    }

    private Palindrome(){}

    public boolean isPalindrome(int x) {
        char[] strX = String.valueOf(x).toCharArray();
        boolean status = true;
        int n = strX.length/2;
        int m = strX.length%2;
        int i = n;
        if (m == 0){
            while (i > 0){
               if (strX[i -1] != strX[2*n - i]){
                   status = false;
               }
               i--;
            }
        }else{
            while (i > 0){
                if (strX[i -1] != strX[2*n - i + 1]){
                    status = false;
                }
                i--;
            }
        }
        return status;
    }
}
