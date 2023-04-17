package Medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassNmae lengthOfLongestSubstring_2
 * @Author:yys4608
 * @Date: 2023/4/17 19:39
 * @Description:给定一个字符串 s ，找出其中不含有重复字符的 最长子串 的长度。
 */
public class lengthOfLongestSubstring_2 {
    /**
     * @deprecated 滑动窗口方法，使用hash表的方式来确认 字符是否包含在hasb表内，就可以确认是否重复
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
       int  len=s.length();
       int left=0,max=0;
        Map<Integer, Character> map = new HashMap<>();
        if (len==0)
           return 0;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(i,s.charAt(i));
            max=Math.max(max,i-left+1);
        }

        return max;
    }
}
