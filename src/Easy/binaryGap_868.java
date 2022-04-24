package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/04/24/21:19
 * @Description:
 */
public class binaryGap_868 {
    //方法一：简单模拟
    public int binaryGap(int n) {
        String s =Integer.toBinaryString(n);
         int l=s.length();
         int index=-1;
         int ans=0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i)=='1'){
                if (index==-1){
                    index=i;
                }else {
                    ans=Math.max(ans,i-index);
                    index=i;
                }
            }
        }
        return ans;
    }
    /*方法2，位运算*/
    public int binaryGap1(int n){
        int ans=0;
        int index=-1;
        for (int i = 0; n!=0 ; i++) {
            if ((n&1)==1){
                if (index==-1){
                    index=i;
                } else {
                    ans=Math.max(ans,i-index);
                    index=i;
                }
            }
            n=n>>1;
        }
        return ans;
    }
}
