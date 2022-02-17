package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yuchuanqi
 * @Date: 2022/02/15/22:44
 * @Description:
 */
public class luckyNumbers_1380 {
    public static void main(String[] args) {
        int [][] arr=new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(arr).toString());
    }
    public  static List<Integer> luckyNumbers (int[][] matrix) {
         int m=matrix.length;
         int n=matrix[0].length;
         int [] rowMin=new int[m];
         int [] colMax=new int[n];
         Arrays.fill(rowMin,1000001);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowMin[i]=Math.min(rowMin[i],matrix[i][j]);
                colMax[j]=Math.max(colMax[j],matrix[i][j]);
            }
        }
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==rowMin[i] && matrix[i][j]==colMax[j]) {
                    list.add(matrix[i][j]);
                }

            }

            }
            return list;
        }
    }


