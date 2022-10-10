package Easy;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @Author: yuchuanqi
 * @Date: 2022/10/08/17:29
 * @Description:
 */
public class isValid_20 {
    public boolean isValid(String s) {
        int len=s.length();
        if (len%2!=0)
            return false;
        Deque stack =new LinkedList();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for (int i = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))){
                if (stack.isEmpty() ||stack.peek()!=map.get(s.charAt(i)))
                    return false;
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
