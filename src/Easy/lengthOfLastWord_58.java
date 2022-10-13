package Easy;

/**
 * @ClassNmae lengthOfLastWord_58
 * @Author:yys4608
 * @Date: 2022/10/13 15:42
 * @Description:返回字符串最后一个单词的长度
 */
public class lengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int len=s.length();
        int res=0;
        for (int i = len-1; i >=0; i--) {
            if (s.charAt(i)!=' '){
                res++;
            } else if (s.charAt(i)==' '){
                return res;
            }
        }
        return  res;
    }
}
