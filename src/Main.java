import problems.p3.NoRepeatString;
import problems.p4.MedianNumber;

/**
 * LeetCode的main函数
 */
public class Main {
    public static void main(String[] args) {
        //p3
//        NoRepeatString noRepeatString = new NoRepeatString();
//        System.out.println(noRepeatString.lengthOfLongestSubstring("mbbungzfpcbbgpzusqxqejrlsmkqtglijpcxxbcmffnlvnfpdd"));

        //p4
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        MedianNumber medianNumber = new MedianNumber();
        System.out.println(medianNumber.findMedianSortedArrays(nums1, nums2));

    }
}
