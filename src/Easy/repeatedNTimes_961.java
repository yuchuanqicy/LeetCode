package Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: yuchuanqi
 * @Date: 2022/05/21/10:26
 * @Description:
 */
public class repeatedNTimes_961 {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for (int num :
                nums) {
            if (!res.add(num)) return num;
        }
        return -1;
    }
}
