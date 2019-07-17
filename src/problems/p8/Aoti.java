package problems.p8;

import java.util.ArrayList;
import java.util.List;

public class Aoti {
    private static Aoti instance = new Aoti();

    public static Aoti getInstance(){
        if (instance == null){
            instance = new Aoti();
        }
        return instance;
    }

    /**
     * 如果存在减号，则判断后面的是否为数字，如果不存在则寻找数字
     * @param str
     * @return
     */
    public int myAtoi(String str){
        if (str.equals("")||str.equals("+")||str.equals("-")){
            return 0;
        }
        char[] stioArray = str.toCharArray();
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while(' ' == str.charAt(i)){   //char和String以及相等判断的问题需要研究一下
            i++;
        }
        List arrayList = new ArrayList();
        while (j < 10){
            arrayList.add(String.valueOf(j));
            j++;
        }
        arrayList.add("-");
        arrayList.add("+");
        if (arrayList.contains(str.substring(i,i+1))){
            if (str.length()>1&&!arrayList.contains(str.substring(i+1,i+2))){
                return 0;
            }
        }else{
            return 0;
        }
        for (int k = i; k < stioArray.length; k++){
            if (arrayList.contains(str.substring(k, k+1)) && !str.substring(k, k+1).equals("+")){
                sb.append(stioArray[k]);
            }
        }
        if (sb.toString().substring(0,1).equals("-")) {
            try {
                if (-1 * Integer.parseInt(sb.toString().replace("-", ""))/10 < Integer.MIN_VALUE/10){
                    return Integer.MIN_VALUE;
                }
            }catch (Exception e){
                return Integer.MIN_VALUE;
            }
            return -1 * Integer.parseInt(sb.toString().replace("-", ""));
        }else {
            try{
                if (Integer.parseInt(sb.toString())/10 > Integer.MAX_VALUE/10){
                    return Integer.MAX_VALUE;
                }
            }catch (Exception e){
                return Integer.MAX_VALUE;
            }
            return Integer.parseInt(sb.toString());
        }
    }
}
