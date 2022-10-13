package Easy;

/**
 * @ClassNmae plusOne_66
 * @Author:yys4608
 * @Date: 2022/10/13 20:18
 * @Description:整数+1
 */
public class plusOne_66 {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        for (int i = len-1; i >=0; i--) {
            digits[i]++;
            if (digits[i]%10!=0)
                return digits;
        }
        int [] res=new int[len+1];
        res[0]=1;
        return res;
    }
}
