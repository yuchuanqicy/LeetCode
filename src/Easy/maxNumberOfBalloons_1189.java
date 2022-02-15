package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/02/13/14:28
 * @Description:
 */
public class maxNumberOfBalloons_1189 {
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons1("nlaebolko"));
    }
    /*方法一：直接遍历，统计balloon各个字符的个数，取短板，l、o除以2向下取整*/
    public static int maxNumberOfBalloons1(String text) {
        int len=text.length();
        int [] res=new int[5];
        for (int i = 0; i < len; i++) {
            char str=text.charAt(i);
            if (str=='b') res[0]++;
            if (str=='a') res[1]++;
            if (str=='l') res[2]++;
            if (str=='o') res[3]++;
            if (str=='n') res[4]++;
        }
        res[2]/=2;
        res[3]/=2;
        int ans=res[0];
        for (int i = 0; i < res.length; i++) {
             ans=Math.min(ans,res[i]);
        }
        return ans;
    }
    /*方法二：使用hash表，字符串长度有限，可以使用数组模拟hash表*/
    public static int maxNumberOfBalloons2(String text) {

        return 1;
    }
}
