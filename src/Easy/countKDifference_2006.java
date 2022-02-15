package Easy;



import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yuchuanqi
 * @Date: 2022/02/09/22:51
 * @Description:
 */
public class countKDifference_2006 {
    public static void main(String[] args) {
        int [] nums={1,2,2,1};
        System.out.println(countKDifference2(nums,1));
        System.out.println(countKDifference1(nums,1));
    }
    /*方法一*/
    public static int  countKDifference1(int[] nums, int k) {
        int count=0;
        int len=nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (Math.abs(nums[i]-nums[j])==k) count++;
            }
        }
            return count;
    }
    public static int countKDifference2(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        int ans = 0;
        for (int j = 0; j < nums.length; j++) {
            ans += count.getOrDefault(k + nums[j], 0);
            ans += count.getOrDefault(nums[j] - k, 0);
            count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);
        }
        return ans;
    }

}
