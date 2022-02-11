package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yuchuanqi
 * @Date: 2022/02/10/23:23
 * @Description:
 */
public class simplifiedFractions_1447 {
    public static void main(String[] args) {
        int n=9;
        System.out.printf(simplifiedFractions(n).toString());
    }
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static List<String> simplifiedFractions(int n) {
        List <String>  list=new ArrayList<>();
        for (int i = 1; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                if (gcd(i,j)==1){
                    list.add(i+"/"+j);
                }
            }

        }
        return list;

    }
}
