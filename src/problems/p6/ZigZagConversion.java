package problems.p6;

/**
 * z字形变换
 */

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        String conversion = "";
        char[] attr = s.toCharArray();
        int number = 0;
        if (attr.length%(2*numRows-2) == 0){
            number = attr.length/(2*numRows-2);
        }else {
            number = attr.length/(2*numRows-2) + 1;
        }
        for (int i = 1; i<=numRows; i++){
            if (i == 1 || i == numRows){
                for (int j = 1; j <= number; j++){
                    if ((2*numRows-2)*(j-1)+i <= attr.length){
                        conversion += attr[(2*numRows-2)*(j-1)+i-1];
                    }
                }
            }else{
                for (int j = 1; j <= number; j++){
                    if ((2*numRows-2)*(j-1)+i <= attr.length){
                        conversion += attr[(2*numRows-2)*(j-1)+i-1];
                    }
                    if (j*(2*numRows-2)-i+2 <= attr.length){
                        conversion += attr[j*(2*numRows-2)-i+2-1];
                    }
                }
            }
        }
        return conversion;
    }
}
