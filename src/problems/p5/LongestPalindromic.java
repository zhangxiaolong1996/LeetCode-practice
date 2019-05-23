package problems.p5;

/**
 * problem5、最长回文子串
 *
 * 排除暴力的解决办法，还有的解法是动态规划
 * 还有其他算法
 */

public class LongestPalindromic {
    public String longestPalindrome(String s) {
        if (s.equals("")){
            return "";
        }
        String longestStr = "";
        int length = s.length();
        char[] charStr = s.toCharArray();
        int begin = 0, end = 0;
        int[][] dp = new int[length][length];

        //初始化动态规划
        for (int i = 0; i < length; i++){
           dp[i][i] = 1;
           if (i < length - 1 && charStr[i] == charStr[i+1]){
               dp[i][i+1] = 1;
               begin = i;
               end = i+1;
           }
        }

        //动态规划解决子问题
        for (int k = 3; k <= length; k++){
            for (int j = 0; j < length - k + 1; j++){
                int i = j + k - 1;
                if (charStr[i] == charStr[j] && dp[j+1][i-1] == 1){
                    dp[j][i] = 1;
                    begin = j;
                    end = j + k - 1;
                }
            }
        }

        for (int i = begin; i <= end; i++){
            longestStr += charStr[i];
        }
        return longestStr;
    }
}
