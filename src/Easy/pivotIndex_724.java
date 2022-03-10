package Easy;

import java.util.Arrays;

/**
 * @Author: yuchuanqi
 * @Date: 2022/03/10/22:34
 * @Description:
 */
public class pivotIndex_724 {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{2,1,-1}));
    }
    public static int pivotIndex(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];

        }
        for (int i = 0; i < nums.length; i++) {
            if (i==0){
                if (nums[nums.length-1]-nums[0]==0) return 0;
            }else if (nums[i]==nums[nums.length-1]-nums[i-1]) return i;
        }
        return -1;
    }
    /*通过数学思维来做*/
    public static int pivotIndex1(int [] nums){
        int sum=Arrays.stream(nums).sum();
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            if (2*res+nums[i]==sum) return i;
            res+=nums[i];
        }
        return -1;
    }
}
