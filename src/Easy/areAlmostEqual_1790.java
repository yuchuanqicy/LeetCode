package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/10/11/22:07
 * @Description:
 */
public class areAlmostEqual_1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;
        int len1=s1.length();
        int  cnt=0;
        int a=-1;
        int b=-1;
        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i)==s2.charAt(i))
                continue;
            else {
                cnt++;
                if (a==-1)
                    a=i;
                else {
                    b=i;
                }
            }
        }
        if (cnt==2){

            return s1.charAt(a)==s2.charAt(b) && s1.charAt(b)==s2.charAt(a);
        }else {
            return false;
        }
    }
}
