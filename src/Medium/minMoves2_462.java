package Medium;

import javax.xml.bind.annotation.XmlID;
import java.util.Arrays;

/**
 * @Author: yuchuanqi
 * @Date: 2022/05/19/21:16
 * @Description:
 */
public class minMoves2_462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int m=nums[len/2];
        int res=0;
        for (int n :nums) {
            res+=Math.abs(n-m);
        }
        return res;
    }
}
