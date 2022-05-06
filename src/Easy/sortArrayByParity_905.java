package Easy;

public class sortArrayByParity_905 {
//    遍历两次数组，先找出所有偶数，添加在新的数组中，在遍历一次数组找出奇数，在追加在刚刚的数组中
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int index=0;
        int [] res=new int[len];
        for (int num:nums) {
            if (num%2==0){
                res[index++]=num;
            }

        }
        for (int num : nums) {
            if (num % 2 != 0){
                res[index++]=num;
            }
        }
        return res;
    }
//    双指针，判断为偶数从数组左边添加，为奇数从右边添加
    public int[] sortArrayByParity2(int[] nums){
        int len = nums.length;
        int[] res = new int[len];
        int left=0;
        int right=len-1;
        for (int num :
                nums) {
            if(num%2==0){
                res[left++]=num;
            }else res[right--]=num;
        }
        return res;
    }
//    双指针原地排序
    public int[] sortArrayByParity3(int[] nums){
        int len = nums.length;
        int i=0,j=len-1;
        while (i<j){
            while (i<j && nums[i]%2==0)
                i++;
            while (i<j && nums[j]%2==1)
                j--;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        return nums;
    }
}
