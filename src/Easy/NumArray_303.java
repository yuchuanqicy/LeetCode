package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/03/09/22:38
 * @Description:
 */
 class NumArray {
      int  [] sum;
    public  void  NumArray(int[] nums) {
        sum=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i==0){
                sum[0]=nums[0];
            }else {
                sum[i]=nums[i]+sum[i-1];
            }
        }
    }

    public  int sumRange(int left, int right) {
        if (left == 0) {
            return sum[right];
        }
        return sum[right]-sum[left-1];
    }
}
public class NumArray_303{
    public static void main(String[] args) {
        NumArray numArray = new NumArray();
        numArray.NumArray(new int[]{-2, 0, 3, -5, 2, -1});

        System.out.println(numArray.sumRange(0,2));
    }
}