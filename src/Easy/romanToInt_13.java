package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/08/23/22:52
 * @Description:
 */
public class romanToInt_13 {
    public int romanToInt(String s) {
        int sum =0;
        for (int i = 0; i < s.length(); i++) {
                int num=getV(s.charAt(i));
             if (i<s.length()-1 && num<getV(s.charAt(i+1))){
                 sum=sum-num;
             }else {
                 sum+=num;
             }
        }
        return  sum;
    }
    public int getV(char cha){
        switch (cha){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
