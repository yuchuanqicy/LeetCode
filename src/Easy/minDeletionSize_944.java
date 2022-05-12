package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/05/12/22:48
 * @Description:
 */
public class minDeletionSize_944 {
    public int minDeletionSize(String[] strs) {
//        行数
        int  rows=strs.length;
//    列数
        int cols =strs[0].length();
        int res=0;
        for (int i = 0; i < cols; i++) {
            for (int j = 1; j < rows; j++) {
                if (strs[j-1].charAt(i)>strs[j].charAt(i)) {
                    res++;
                    break;
                }
            }

        }
        return  res;
    }
}
