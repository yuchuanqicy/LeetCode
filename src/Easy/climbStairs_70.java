package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/10/16/22:43
 * @Description:
 */
public class climbStairs_70 {
    public int climbStairs(int n) {
        int  a=1;
        int  b=2;
        int res=0;
        if (n<=2)
            return n;
        for (int i = 3; i <= n; i++) {
            res=a+b;
            a=b;
            b=res;
        }
        return res;
    }
}
