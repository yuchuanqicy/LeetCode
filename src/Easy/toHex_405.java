package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2021/09/14/22:38
 * @Description:
 */
public class toHex_405 {
    public static void main(String[] args) {
        String res=toHex(-1);
        System.out.println(res);

    }
    public  static  String toHex(int nums){
        if (nums==0)
            return "0";
        char[]  chars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuffer sb = new StringBuffer();
        int temp;
        while (nums!=0){
            temp= nums & 15;
            sb.insert(0,chars[temp]);
            nums=nums>>>4;
        }
        return sb.toString();
    }
    public static String toHex2(int num){
        if (num==0)
            return "0";
        String s=new String();

        return s;
    }

}
