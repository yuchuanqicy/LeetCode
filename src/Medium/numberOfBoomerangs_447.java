package Medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yuchuanqi
 * @Date: 2021/09/13/23:57
 * @Description:
 */
public class numberOfBoomerangs_447 {
    public static void main(String[] args) {

     /*   int [] [] arr={{1,2,3,4},{4,5,6,7}};
        int length = arr.length;
        System.out.println(length);*/
        int [] [] arr={{0,0},{1,0},{2,0}};
        int res = numberOfBoomerangs(arr);

        System.out.println(res);
    }
    public  static  int numberOfBoomerangs(int [] [] list){
        int ans=0;
        int l =list.length;
        for (int i = 0; i < l; i++) {
            Map <Integer ,Integer> map = new HashMap <> ();
            int [] arr1=list[i];
            for (int j = 0; j < l; j++) {
//                int[] arr2=list[j];
                if (i!=j){
                    int [] arr2=list[j];
                    int x=arr2[0]-arr1[0];
                    int y=arr2[1]-arr1[1];
                    int distance=x*x+y*y;
                    map.put(distance,map.getOrDefault(distance,0)+1);
                    
                }
            }
            for (int val: map.values()) {
                ans=ans+val*(val-1);
            }

        }
        return ans;
    }
}
