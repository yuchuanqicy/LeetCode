package Easy;

import java.util.Arrays;

/**
 * @Author: yuchuanqi
 * @Date: 2022/08/24/23:12
 * @Description:
 */
public class canBeEqual_1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int len=target.length;
        for (int i = 0; i < len; i++) {
            if (target[i]!=arr[i]){
                return false;
            }

        }
        return true;
    }
}
