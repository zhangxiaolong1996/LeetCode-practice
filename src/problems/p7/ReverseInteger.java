package problems.p7;

/**
 * java 的异常抛出解决溢出问题
 */

public class ReverseInteger {
    public int reverse(int x) {
        int number = 0;
        try{
            if (x > 0){
                number = Integer.parseInt((new StringBuilder(String.valueOf(x))).reverse().toString());
            }
            else if (x == 0){
                number = 0;
            }
            else {
                number = Integer.parseInt((new StringBuilder(String.valueOf(-x))).reverse().toString());
                number = -1*number;
            }
            return number;
        }catch (Exception e){
            return 0;
        }
    }
}
