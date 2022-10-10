package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/10/10/22:54
 * @Description:
 */
public class removeElement_27 {
//    双指针(拷贝覆盖)
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        int left=0;
        for (int i = 0; i < len; i++) {
            if (nums[i]!=val){
                nums[left]=nums[i];
                ++left;
            }
        }
        return left;
    }
}
