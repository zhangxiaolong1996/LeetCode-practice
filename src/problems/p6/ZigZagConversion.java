package problems.p6;

/**
 * z字形变换
 *
 * 从这道题中可以得出的结论是，java代码的内存耗用是很大的
 * 在使用合适的方法和变量的时候，可以有效地较低内存的使用，我提交的两个版本内存耗用降低了20M，时间从60多ms
 * 降低到了12ms，合理的对代码进行修改就会取得进步
 */

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        int len = s.length();
        StringBuilder conversion = new StringBuilder(s.length());
        char[] attr = s.toCharArray();
        int number = 0;
        if (len%(2*numRows-2) == 0){
            number = len/(2*numRows-2);
        }else {
            number = len/(2*numRows-2) + 1;
        }
        for (int i = 1; i<=numRows; i++){
            if (i == 1 || i == numRows){
                for (int j = 1; j <= number; j++){
                    if ((2*numRows-2)*(j-1)+i <= len){
                        conversion.append(attr[(2*numRows-2)*(j-1)+i-1]);
                    }
                }
            }else{
                for (int j = 1; j <= number; j++){
                    if ((2*numRows-2)*(j-1)+i <= len){
                        conversion.append(attr[(2*numRows-2)*(j-1)+i-1]);
                    }
                    if (j*(2*numRows-2)-i+2 <= len){
                        conversion.append(attr[j*(2*numRows-2)-i+2-1]);
                    }
                }
            }
        }
        return conversion.toString();
    }
}
