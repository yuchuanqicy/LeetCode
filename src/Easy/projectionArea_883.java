package Easy;

import java.util.Map;

/**
 * @Author: yuchuanqi
 * @Date: 2022/04/26/23:14
 * @Description:
 */
public class projectionArea_883 {
    public int projectionArea(int[][] grid) {
        int len= grid.length;
        int s1=0,s2=0,s3=0;
        int a=0,b=0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <len ; j++) {
                if (grid[i][j]>0) s1++;
                a= Math.max(a,grid[i][j]);
                b=Math.max(b,grid[j][i]);
            }
            s2+=a;
            s3+=b;
        }
        return s1+s2+s3;
    }
}
