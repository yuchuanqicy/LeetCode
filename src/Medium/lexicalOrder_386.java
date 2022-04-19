package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yuchuanqi
 * @Date: 2022/04/18/23:17
 * @Description:
 */
public class lexicalOrder_386 {
    public static void main(String[] args) {

        System.out.println(lexicalOrder(13));
    }
    static List <Integer>list=new ArrayList<>();
    public static List<Integer> lexicalOrder(int n) {
        for (int i = 1; i <=9; i++) {
            dfs(i,n);
        }
        return list;
    }
    public static void dfs(int cur,int end){
        if (cur>end) return;
        list.add(cur);
        for (int i = 0; i <=9; i++) {
            dfs(cur*10+i,end);
        }
    }
}
