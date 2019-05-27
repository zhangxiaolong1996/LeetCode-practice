import problems.p3.NoRepeatString;
import problems.p4.MedianNumber;
import problems.p5.LongestPalindromic;
import problems.p6.ZigZagConversion;

/**
 * LeetCode的main函数
 */
public class Main {
    public static void main(String[] args) {
        //p3
//        NoRepeatString noRepeatString = new NoRepeatString();
//        System.out.println(noRepeatString.lengthOfLongestSubstring("mbbungzfpcbbgpzusqxqejrlsmkqtglijpcxxbcmffnlvnfpdd"));

        //p4
//        int[] nums1 = {1, 2};
//        int[] nums2 = {3, 4};
//        MedianNumber medianNumber = new MedianNumber();
//        System.out.println(medianNumber.findMedianSortedArrays(nums1, nums2));

//        p5、最长回文子串
//        LongestPalindromic longestPalindromic = new LongestPalindromic();
//        System.out.println(longestPalindromic.longestPalindrome("ccc"));

//        p6、z字形变换
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        System.out.println(zigZagConversion.convert("PAYPALISHIRING", 3));

    }
}
