package main;

/**
 * @Author: yuchuanqi
 * @Date: 2023/04/06/23:56
 * @Description:
 */
public class Solution1 {
    public  static String longestCommonPrefix (String[] strs) {
        // write code here
        if (strs.length==0){
            return " ";
        }
        int minLength = Integer.MAX_VALUE; // 记录最短字符串的长度
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            char c = strs[0].charAt(strs[0].length() - 1 - i); // 取第一个字符串的第i个字符
            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(strs[j].length() - 1 - i)) { // 只要有不一样的字符，就退出循环
                    return sb.reverse().toString();
                }
            }
            sb.append(c); // 如果当前字符相同，就将其添加到 sb 中
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String strs[] =new String[]{"buyer","boxer","flyer"};
        System.out.println(longestCommonPrefix(strs));
    }
}
