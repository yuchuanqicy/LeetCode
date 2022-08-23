package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/06/08/23:07
 * @Description:
 */
public class isBoomerang_1037 {
    public boolean isBoomerang(int[][] points) {

        return (points[1][1]-points[0][1])*(points[2][0]-points[1][0])!= (points[2][1]-points[1][1])*(points[1][0]-points[0][0]);
    }
}
