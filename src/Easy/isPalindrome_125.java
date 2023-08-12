package Easy;

public class isPalindrome_125 {
    //    判断回文字符串，方法一 通过遍历字符串 删除空格等非法字符，得到新字符串，反转字符串和新字符串对比，相同返回True
    public static boolean isPalindrome1(String s) {
        if (s == null) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {

                stringBuilder.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.reverse().toString());
        if (stringBuilder.toString().equals(stringBuilder.reverse().toString()))
            return true;
        return false;
    }

    //    在方法一的思路下，先去掉非字母数字的字符，得到新字符串，在使用双指针 对新字符串进行遍历，比较左右字符是否相等
    public static boolean isPalindrome2(String s) {
        int len = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stringBuilder.append(Character.toLowerCase(ch));
            }

        }
        int left = 0;
        int right = stringBuilder.length() - 1;

        while (left < right) {
            if (stringBuilder.charAt(left) != stringBuilder.charAt(right)) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }
    public static boolean isPalindrome3(String s){

        return true;

    }

}
