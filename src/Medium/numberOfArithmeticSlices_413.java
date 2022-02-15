package Medium;

public class numberOfArithmeticSlices_413 {
    public static void main(String[] args) {
        int list [] ={1,2,3,4,5};
        int res =numberOfArithmeticSlices(list);
        System.out.println(res);
    }

    public static int numberOfArithmeticSlices(int list []){
        if (list.length<3)
            return 0;
        int l=2;
        int res=0;
//        初始化公差
        int preD=list[1]-list[0];
        for (int i = 2; i < list.length; i++) {
            int D=list[i]-list[i-1];
            if (D==preD){
                l++;
            }else {
                res+=(l-1)*(l-2)/2;
                l=2;
            }
            
        }
        res+=(l-1)*(l-2)/2;
        return res;
    }
}
