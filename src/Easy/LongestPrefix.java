package Easy;

import java.util.Scanner;

/**
 * @Author: wangqi
 * @Date: 2021/4/11 9:57
 */
//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
//
//
// 示例 1：
//
//
//输入：strs = ["flower","flow","flight"]
//输出："fl"
//
//
// 示例 2：
//
//
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。
//
//
//
// 提示：
//
//
// 0 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] 仅由小写英文字母组成
//
// Related Topics 字符串
// 👍 1556 👎 0

public class LongestPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] stringArray = s.split(" ");
        for (String s1 : stringArray) {
            System.out.println(s1);
        }

        String result = solution(stringArray);
        System.out.println("最大公共字符串:"+result);
    }
    //横向扫描
    public static String solution(String[] strs) {
        if (strs.length==0)
            return " ";
        String pre=strs[0];
        for (int i = 1; i < strs.length ; i++) {
            int j=0;
            for (; j <strs[0].length() && j<strs[i].length();j++) {
                if (pre.charAt(j)!=strs[i].charAt(j))
                    break;
            }
            pre=pre.substring(0,j);
            if (pre.equals(""))
                return " ";
        }
        return pre;
    }
    //纵向扫描
    public static String  longestPrefix(String [] strs){
        if (strs.length==0||strs==null)
            return "";
        int len=strs[0].length();
        int count=strs.length;
        for (int i = 0; i < len; i++) {
            char c =strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i==strs[j].length() || strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }

        }
        return strs[0];
    }

}
