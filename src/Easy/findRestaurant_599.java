package Easy;

import java.util.*;

public class findRestaurant_599 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"})));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map <String,Integer> map = new HashMap<>();
        for (int i = 0; i <list1.length; i++) {
            map.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        for (int i = 0; i <list2.length ; i++) {
            if (map.containsKey(list2[i])){
                int res=i+ map.get(list2[i]);
                if (res==min){
                    list.add(list2[i]);
                }else if (res<min){
                    min=res;
                    list.clear();
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(list.toArray(new String[list.size()]));
    }

}
