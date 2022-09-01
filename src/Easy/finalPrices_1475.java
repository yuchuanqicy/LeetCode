package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/09/01/22:56
 * @Description:
 */
public class finalPrices_1475 {
    public int[] finalPrices(int[] prices) {
        int len=prices.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <len ; j++) {
                if (prices[j]<=prices[i]){
                    prices[i]=prices[i]-prices[j];
                    break;
                }

            }
        }
        return prices;
    }
}
