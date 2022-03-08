package Easy;

import java.util.Arrays;

/**
 * @Author: yuchuanqi
 * @Date: 2022/03/08/22:47
 * @Description:
 */
public class runningSum_1480 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum1(new int[]{1,2,3,4,5,6}) ));
        System.out.println(Arrays.toString(runningSum2(new int[]{1,2,3,4,5,6}) ));
    }
//    前缀和基础版
    public static int [] runningSum1(int [] nums){
        int res []=new int[nums.length];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            res[i]=sum;

        }
        return res;
    }
//    前缀数组求和精简版
    public static int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
