package Easy;

import org.omg.PortableServer.LifespanPolicyValue;

/**
 * @Author: yuchuanqi
 * @Date: 2022/03/07/22:19
 * @Description:
 */
public class convertToBase7_504 {
    public static void main(String[] args) {
        System.out.println(convertToBase7_2(10));
    }
/*API战士*/
    public static String convertToBase7_1(int num) {

        return Integer.toString(num,7);
    }
    public static  String convertToBase7_2(int num){
        if (num==0) return "0";
        boolean flag = num < 0;
        StringBuilder sb=new StringBuilder();
        if (num<0){
            num=-num;
        }
        while (num!=0){
            sb.append(num%7);
            num/=7;
        }

        if (flag){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
