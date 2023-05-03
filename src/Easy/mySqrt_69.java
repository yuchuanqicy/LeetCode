package Easy;

/**
 * @ClassNmae mySqrt_69
 * @Author:yys4608
 * @Date: 2022/10/14 16:38
 * @Description:实现X的算术平方根
 */
public class mySqrt_69 {
    public int mySqrt(int x) {
        long ans=0;
        for (int i = 0; i*i <= x; i++) {
            ans=i;
        }
        return (int) ans;
    }

  /*@Author:chuanqiyu
    *@DateTime 17:06 2022/10/14
    *@Params
    *@Retuen
    */
    public int mySqrt1(int x){
        int i=0;
        int left=0;
        int right=x-1;
        int mid=0;
        while (left<=right){
            mid=(left+right)/2;
            if ((long)mid*mid<=x){
                i=mid;
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return i;
    }
}
