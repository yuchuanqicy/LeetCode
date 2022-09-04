package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/09/04/23:00
 * @Description:
 */
public class numSpecial_1582 {
    public int numSpecial(int[][] mat) {
        int m= mat.length;
        int n=mat[0].length;
        int res=0;
        int [] RowSum=new int [m];
        int [] ColSum=new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                RowSum[i]+=mat[i][j];
                ColSum[j]+=mat[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] ==1 && RowSum[i]==1 && ColSum[j]==1){
                    res++;
                }
            }
        }
        return res;
    }
}
