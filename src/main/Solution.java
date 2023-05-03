package main;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yuchuanqi
 * @Date: 2023/04/06/23:38
 * @Description:
 */
public class Solution {
    public int lengthOfLongestSubstring (String s) {
        int n =s.length();
        int result=0;
        if (n==0){
            return 0;
        }
        Map <Character, Integer> map = new HashMap<>();
        for (int i = 0,j=0; j < n; j++) {
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j))+1,i);
            }
            result=Math.max(result,j-i+1);
            map.put(s.charAt(j),j);
        }
        return result;
    }



}
