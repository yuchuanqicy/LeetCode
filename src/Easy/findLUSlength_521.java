package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/03/05/19:20
 * @Description:
 */
public class findLUSlength_521 {
    public static void main(String[] args) {
        System.out.println(findLUSlength("aaa","aaa"));
        System.out.println(findLUSlength2("aaa","aaa"));
    }
    public static int  findLUSlength(String a, String b) {
        if (a.equals(b)==true) return -1;
        if (a.length()==b.length())return a.length();
        else return a.length()>b.length()?a.length():b.length();
    }
    public static int findLUSlength2(String a,String b){
        return !a.equals(b)?Math.max(a.length(),b.length()):-1;
    }
}
