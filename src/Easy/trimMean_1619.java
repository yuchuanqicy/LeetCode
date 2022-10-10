package Easy;

import java.util.Arrays;

/**
 * @ClassNmae trimMean_1619
 * @Author:yys4608
 * @Date: 2022/9/14 16:24
 * @Description:每日一题
 */
public class trimMean_1619 {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len=arr.length;
        int sum=0;
        for (int i = len/20; i <len-len/20 ; i++) {
            sum+=arr[i];
        }
        return sum*1.0/(sum*0.9);
    }
}
