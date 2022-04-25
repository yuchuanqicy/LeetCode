package Medium;

import java.util.*;

/**
 * @Author: yuchuanqi
 * @Date: 2022/04/25/22:55
 * @Description:
 */
public class Solution_398 {
    Random random=new Random();
    Map<Integer, List<Integer>> map=new HashMap<>();

    public Solution_398(int[] nums) {
        int len=nums.length;
        for (int i = 0; i < len; i++) {
            List<Integer> list=map.getOrDefault(nums[i],new ArrayList<>());
            list.add(i);
            map.put(nums[i],list);
        }
    }



    public int pick(int target) {
        List <Integer> list=map.get(target);
        return list.get(random.nextInt(list.size()));

    }
}

class Solution {
    Random random = new Random();
    Map<Integer, List<Integer>> map = new HashMap<>();
    public Solution(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
            list.add(i);
            map.put(nums[i], list);
        }
    }
    public int pick(int target) {
        List<Integer> list = map.get(target);
        return list.get(random.nextInt(list.size()));
    }
}
