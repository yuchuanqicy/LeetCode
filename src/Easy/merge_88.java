package Easy;

import java.util.Arrays;

/**
 * @Author: yuchuanqi
 * @Date: 2022/10/17/23:36
 * @Description:
 */
public class merge_88 {
//    方法1，先直接合并，在排序
    public String merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        return Arrays.toString(nums1);
    }

//方法二，利用有序数组方式，进行有序合并
    public String merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m+i]=nums2[i];
        }

        return Arrays.toString(nums1);
    }
}
