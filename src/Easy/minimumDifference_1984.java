package Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yuchuanqi
 * @Date: 2022/02/11/23:00
 * @Description:
 */
public class minimumDifference_1984 {
    public static void main(String[] args) {
        System.out.println(minimumDifference(new int[] {90},2));
        System.out.println(minimumDifference1(new int[] {90},1));
    }
    /*错误解答，理解错题意*/
    public static int minimumDifference(int[] nums, int k) {
        if (nums.length==1) return 0;
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                list.add(Math.abs(nums[i]-nums[j]));

            }

        }
        int [] res=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);

        }
        Arrays.sort(res);
        return  res[0];

    }
    public static int minimumDifference1(int[] nums, int k) {
        Arrays.sort(nums);
        int len=nums.length;
        int res=Integer.MAX_VALUE;
        for (int i = k-1; i <len ; i++) {
            res=Math.min(res,nums[i]-nums[i-(k-1)]);

        }
        return res;
    }

}
