package Medium;

import java.util.Stack;

/**
 * @Author: yuchuanqi
 * @Date: 2022/04/20/22:50
 * @Description:
 */
public class lengthLongestPath_388 {
    public int lengthLongestPath(String input) {
        String[] splitInput = input.split("\n");
        int ans = 0;
        int tmp = 0;

        Stack<Integer> stk = new Stack<>();

        for (String s: splitInput) {
            int level = s.lastIndexOf('\t') + 1;

            while (level < stk.size()){
                tmp -= stk.pop();
            }
            int len = s.length()-level+1;
            tmp += len;
            stk.push(len);
            if (s.contains(".")) {
                ans = Math.max(ans, tmp-1);
            }
        }
        return ans;

    }
}
