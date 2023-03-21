package Easy;

/**
 * @ClassNmae singleNumber_136
 * @Author:yys4608
 * @Date: 2023/3/17 11:27
 * @Description:给出非空数组，求出非重复的数
 */
public class singleNumber_136 {
//    方法1，使用位运算
    public int singleNumber_1(int[] nums) {
        int len=nums.length;
        int flag=0;
        for (int i = 0; i < len; i++) {
            flag=flag^nums[i];

        }
        return flag;
    }
//    方法二，简单方法，总是有一个不重复的数，统计数组每个数的个数，找出个数为1的数即可
    public int singleNumber_2(int[] nums) {

        return 0;
    }
}
