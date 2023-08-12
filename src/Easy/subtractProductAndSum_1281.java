package Easy;

public class subtractProductAndSum_1281 {
//    通过用取模和整除来模拟来求出整数每位的乘积与和的差值，
    public int subtractProductAndSum_1(int n) {
        int x=1;
        int y=0;

        while (n!=0){
            int s=n%10;
            x*=s;
            y+=s;
            n/=10;
        }
        return x-y;
    }
//方法二,将整数转换为数字字符串，遍历字符串求出和和乘积相减
    public int subtractProductAndSum_2(int n){
        String num=Integer.toString(n);
        int sum=0;
        int mul=1;
        for (int i = 0; i < num.length(); i++) {
            sum=sum+(num.charAt(i)-'0');
            mul=mul*(num.charAt(i)-'0');
        }
        return mul-sum;
    }
}
