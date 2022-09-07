package Algorithm_implementation;

/**
 * @ClassNmae Bubble_Sort
 * @Author:chuanqiyu
 * @Date: 2022/9/3 10:52
 * @Description:冒泡排序实现类
 */
public class Bubble_Sort {
    /*@Author:chuanqiyu
    *@DateTime 11:31 2022/9/3
    *@Params [nums]
    *@Retuen int[]
    */
    public  int [] bubble_Sort(int [] nums){
        int len =nums.length;
        for (int i = 0; i < len-1; i++) {
            for (int j =1; j <len-i-1 ; j++) {
                int tem;
                if (nums[j]<nums[j-1]){
                    tem=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=tem;
                }
            }
        }
        return nums;
    }
}
