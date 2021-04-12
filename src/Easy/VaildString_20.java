package Easy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author: wangqi
 * @Date: 2021/4/12 9:03
 */
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
//
//
// 示例 1：
//
//
//输入：s = "()"
//输出：true
//
//
// 示例 2：
//
//
//输入：s = "()[]{}"
//输出：true
//
//
// 示例 3：
//
//
//输入：s = "(]"
//输出：false
//
//
// 示例 4：
//
//
//输入：s = "([)]"
//输出：false
//
//
// 示例 5：
//
//
//输入：s = "{[]}"
//输出：true
//
//
//
// 提示：
//
//
// 1 <= s.length <= 104
// s 仅由括号 '()[]{}' 组成
//
// Related Topics 栈 字符串
// 👍 2320 👎 0

public class VaildString_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Boolean result = soultion(s);
        System.out.println(result);
    }

    public static Boolean soultion(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Deque<Character> stack = new LinkedList<>();
        char[] cc = s.toCharArray();
        for(char c: cc){
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else{
                if(stack.isEmpty()) return false;
                if(stack.peek() == '(') {
                    if(c == ')') stack.pop();
                    else return false;
                } else if(stack.peek() == '['){
                    if(c == ']') stack.pop();
                    else return false;
                } else if(stack.peek() == '{'){
                    if(c == '}') stack.pop();
                    else return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
