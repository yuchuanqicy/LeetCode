package Medium;

/**
 * @Author: yuchuanqi
 * @Date: 2022/02/14/23:21
 * @Description:
 */
public class singleNonDuplicate_540 {
    public static void main(String[] args) {
        int [] arry={1,1,2,2,3,4,4,5,5};
        int a=singleNonDuplicate(arry);
        System.out.print(a);
    }
    /*方法1 使用异或*/
    public static int singleNonDuplicate(int[] nums) {
        int len =nums.length;
        int res=0;
        for (int i = 0; i < len; i++) {
            res^=nums[i];
        }
        return res;
    }
}
