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
        String res4=toHex4(-7);
        System.out.println(res4);
        System.out.println(Integer.numberOfLeadingZeros(0));
    }
//    方法一
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
//    方法二
    public static String toHex2(int num){
        int temp;
        StringBuffer sb = new StringBuffer();
        if (num==0)
            return "0";
        while (num!=0){
            temp= num & 15;
        }
        return sb.toString();
    }
    public String toHex3(int num) {
        StringBuilder bl = new StringBuilder();
        if (num == 0) {
            bl.insert(0, 0);
        }
        long y = num < 0 ? num & 0x00000000ffffffffL : num;
        while (y != 0) {
            char hex = (char) (y % 16 < 10 ? y % 16 + '0' : y % 16 - 10 + 'a');
            bl.insert(0, hex);
            y >>= 4;
        }
        return bl.toString();
    }
    public static String toHex4(int num ){
        StringBuffer sb = new StringBuffer();
//        int类型是32位，所以Integer.SIZE为32，numberOfLeadingZeros方法是返回无符号整数,从最高位开始到最低位连续0的个数 例如： 0000 0000 0000 0000 1000 1100 0000 1100 返回的是16
        int l=Integer.SIZE-Integer.numberOfLeadingZeros(num);
//       将num 按照每四位 二进制一组 求出多少组即多少位十六进制位数
        int len=(l+3)/4;
        char [] chars=new char[len];
        int temp;
        if (num==0){
            return "0";
        }
        while (num!=0){
            temp=num & 15;
            chars[--len]= temp<10 ?(char) (temp+48) :(char) (temp+87);
            num=num>>>4;
        }

        return new String(chars);
    }


}
