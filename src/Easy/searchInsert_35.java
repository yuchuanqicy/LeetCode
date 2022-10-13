package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/10/12/22:45
 * @Description:
 */
public class searchInsert_35 {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int i=0;
        int j=len-1;
        int mid=0;
        while (i<=j){
            mid=(i+j)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]<target){
                i=mid+1;
            }else {
                j=mid-1;
            }
        }
            return i;
        }
    }
