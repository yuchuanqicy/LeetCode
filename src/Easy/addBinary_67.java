package Easy;

/**
 * @ClassNmae addBinary_67
 * @Author:yys4608
 * @Date: 2022/10/14 10:12
 * @Description:二进制加法
 */
public class addBinary_67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        //判断是否进位
        int ans=0;
        int lena=a.length();
        int lenb=b.length();
        for (int i=lena-1,j=lenb-1;i>=0 || j>=0;i--,j--){
            int sum = ans;
            sum+=i>=0? a.charAt(i)-'0':0;
            sum+=j>=0? b.charAt(j)-'0':0;
            sb.append(sum%2);
            ans=sum/2;
        }
        if (ans==1){
            sb.append('1');
        }
        return sb.reverse().toString();

    }
}
