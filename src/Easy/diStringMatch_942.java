package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/05/09/23:07
 * @Description:
 */
public class diStringMatch_942 {
    public int[] diStringMatch(String s) {
        int len=s.length();
        int max=s.length();
        int min=0;
        int [] res=new int[len+1];
        for (int i = 0; i <=len; i++) {
            if (s.charAt(i)=='I') res[i]=min++;
            else {
                res[i]=max--;
            }
        }
        res[len]=min;
        return res;
    }
}
