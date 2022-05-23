package Medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yuchuanqi
 * @Date: 2022/05/22/21:41
 * @Description:
 */
public class canIWin_464 {
    Map<Integer,Boolean> map=new HashMap<Integer,Boolean>();
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if((1+maxChoosableInteger)*maxChoosableInteger*0.5<desiredTotal) return false;

        return  dfs(maxChoosableInteger,0,desiredTotal,0);
    }
    public  boolean dfs(int maxChoosableInt,int userInt,int desiredTotal,int curInt){
        if (!map.containsKey(userInt)){
            boolean res=false;
            for (int i = 0; i < maxChoosableInt; i++) {
                if (((userInt>>i) & 1)==0 ){
                    if (1+i+curInt>=desiredTotal) {
                        res=true;
                        break;
                    }
                    if (!dfs(maxChoosableInt,userInt | (1<<i),desiredTotal,curInt+1+i)){
                        res=true;
                        break;
                    }
                }

            }
            map.put(userInt,res);
        }
     return map.get(userInt);
    }
}
