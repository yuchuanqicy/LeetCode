package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/03/03/23:01
 * @Description:
 */
public class addDigits_258 {
    public static void main(String[] args) {
        System.out.println(addDigits(1029));
    }
    /*方法一*/
    public static int addDigits(int num) {

        while (num>9){
            int sum=0;
            while (num!=0){
                sum+=num%10;

                num/=10;
            }
            num=sum;
        }

        return num;
    }
    /*方法二、同余定理以后补充*/
    public static int addDigits2(int num){

        return 1;
    }

}
