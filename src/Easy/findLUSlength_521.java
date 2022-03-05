package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/03/05/19:20
 * @Description:
 */
public class findLUSlength_521 {
    public static void main(String[] args) {
        System.out.println(findLUSlength("aba","cbcv"));
    }
    public static int  findLUSlength(String a, String b) {
        if (a.length()==b.length())return a.length();
        else return a.length()>b.length()?a.length():b.length();
    }
}
