package Medium;

/**
 * @Author: yuchuanqi
 * @Date: 2022/05/05/22:42
 * @Description:
 */
public class numSubarrayProductLessThanK_713 {
    /*双指针解法，注意边界值的意义*/
    public int numSubarrayProductLessThanK(int[] nums, int k) {
//        乘积结果
        int ans=1;
//        左指针
        int j=0;
//        i为右指针
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            if (k<=1) return 0;
            ans*=nums[i];
            while (j<=i && ans >=k){
                ans/=nums[j];
                j++;
            }
            res+=i-j+1;

        }
        return res;
    }
}
