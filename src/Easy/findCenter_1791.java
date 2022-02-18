package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/02/18/23:34
 * @Description:
 */
public class findCenter_1791 {
    public static void main(String[] args) {
        int [] [] arr={{1,2},{2,3},{3,4},{3,5}};
        System.out.println(findCenter(arr));
    }
    public static int  findCenter(int[][] edges) {
        int x=edges[0][0];
        int y=edges[0][1];
        if (x==edges[1][0] || x==edges[1][1])
            return x;
        else return y;
    }
}
