package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yuchuanqi
 * @Date: 2022/02/06/21:52
 * @Description:
 */
public class sumOfUnique_1725 {
    public static void main(String[] args) {
        int str[] ={1,1,1,2,2,3,4,5,6,5,7,7,9,1};

        int res=sumOfUnique(str);
        System.out.println(res);
    }
    public static int  sumOfUnique(int[] nums){
        Map <Integer,Integer> map=new HashMap<Integer,Integer>();
        int sum=0;
        int len=nums.length;
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(nums[i])){
                sum+=nums[i];
                map.put(nums[i],1);
            } else if(map.get(nums[i])==1){
                sum-=nums[i];
                map.put(nums[i],2);
            }

        }

        return sum;
    }


}


