package Medium;

import java.util.Arrays;

/**
 * @Author: yuchuanqi
 * @Date: 2022/05/25/23:46
 * @Description:
 */
public class findSubstringInWraproundString_467 {
    public int findSubstringInWraproundString(String p) {
        int len=p.length();
        int res []=new int[26];
        int ans=0;
        for (int i = 0; i < len; i++) {
            if (i>0 && (p.charAt(i)-p.charAt(i-1)+26)%26==1){
                ans++;
            }else ans=1;
            res[p.charAt(i)-'a']=Math.max(res[p.charAt(i)-'a'],ans);
        }
        return Arrays.stream(res).sum();
    }
}
