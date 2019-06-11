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
        for (int k = i; k < stioArray.length; k++){
            if (arrayList.contains(str.substring(k, k+1)) && !str.substring(k, k+1).equals("+")){
                sb.append(stioArray[k]);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
