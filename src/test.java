import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yuchuanqi
 * @Date: 2023/03/24/20:04
 * @Description:
 */


class TrieNode {
    Map<Character, TrieNode> next;
    boolean flag;
    TrieNode() {
        next = new HashMap<>();
        flag = false;
    }
}

class StreamChecker {
    private TrieNode root;
    private List<Character> stream;

    public StreamChecker(String[] words) {
        root = new TrieNode();
        stream = new ArrayList<>();
        for (String word : words) {
            insert(word);
        }
    }

    public boolean query(char letter) {
        stream.add(letter);
        TrieNode cur = root;
        for (int i = stream.size() - 1; i >= 0; i--) {
            char c = stream.get(i);
            if (!cur.next.containsKey(c)) {
                return false;
            }
            cur = cur.next.get(c);
            if (cur.flag) {
                return true;
            }
        }
        return false;
    }

    private void insert(String word) {
        TrieNode cur = root;
        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            if (!cur.next.containsKey(c)) {
                cur.next.put(c, new TrieNode());
            }
            cur = cur.next.get(c);
        }
        cur.flag = true;
    }
}
