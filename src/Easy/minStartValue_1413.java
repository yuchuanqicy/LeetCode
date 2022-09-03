package Easy;

import java.util.Arrays;

public class minStartValue_1413 {
    public int minStartValue(int[] nums) {
       int len=nums.length;
       int min=0;
       int sum=0;
        for (int num:nums) {
           sum+=num;
           min=Math.min(sum,min);
        }
        return 1-min;
    }
}
