package Hard;

/**
 * @Author: yuchuanqi
 * @Date: 2022/05/18/23:17
 * @Description:
 */
public class findKthNumber_668 {
    public int findKthNumber(int m, int n, int k) {
        int l=1;
        int r=m*n;
        while (l<r){
             int mid=(l+r)/2;
             if (count(m,n,mid)>=k){
                 r=mid;
             }else l=mid+1;
        }
        return  l;
    }
    public int count(int m,int n,int k){
        int res=0;
        for (int i = 1; i <= m; i++) {
            res+=Math.min(k/i,n);
        }
        return res;
    }
}
