package problems.p4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * problem4、寻找两个有序数组的中位数
 */

public class MedianNumber {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        1、使用java原生的方法来解决，代码实现较快但是执行效率不是很高
//        double medianNumber = 0;
//        List list = new ArrayList();
//        for (int num: nums1){
//            list.add(num);
//        }
//        for (int num: nums2){
//            list.add(num);
//        }
//        Collections.sort(list);
//        if (list.size()%2 == 0){
//            medianNumber =  (Double.parseDouble(list.get(list.size()/2 - 1).toString()) + Double.parseDouble(list.get(list.size()/2).toString()))/2;
//        }else {
//            medianNumber = Double.parseDouble(list.get(list.size()/2).toString());
//        }
//        return medianNumber;

        //寻找第n/2个数，不需要全部遍历
        double medianNumber = 0;
        int k = (nums1.length + nums2.length)/2;
        int i = 0, j = 0;
        int mid1 = 0, mid2 = 0;
        while(k >= 0){
            mid1 = mid2;
            if (i == nums1.length){
                mid2 = nums2[j];
                j++;
            }
            else if (j == nums2.length){
                mid2 = nums1[i];
                i++;
            }
            else if (nums1[i] >= nums2[j]){
                mid2 = nums1[i];
                i++;
            }
            else{
                mid2 = nums2[j];
                j++;
            }
            k--;
        }
        if ((nums1.length + nums2.length)%2 == 0){
            medianNumber = (mid2 +mid1)/2.0;
        }else{
            medianNumber = mid2/1.0;
        }

        return medianNumber;
    }
}
