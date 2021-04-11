package Easy;

import java.util.Scanner;

/**
 * @Author: wangqi
 * @Date: 2021/4/9 10:06
 */
//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
//
//
// 示例 1：
//
//
//输入：x = 123
//输出：321



//
/*class Solution {
    public int reverse(int x) {
        int res = 0;
        while(x!=0) {
            //每次取末尾数字
            int tmp = x%10;
            //判断是否 大于 最大32位整数
            if (res>214748364 || (res==214748364 && tmp>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                return 0;
            }
            res = res*10 + tmp;
            x /= 10;
        }
        return res;
    }
}*/
public class NumReverse_7 {
    public static void main(String[] args) {
        System.out.println("整数反转结果：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=reverse(num);
        System.out.println(result);

    }
    public static int reverse(int num){
        int res=0;
        while (num!=0){
            int temp=num%10;
            //正整数，最大值是2^31-1，需要比较前九位，如果正好相等，在比较最后一位的大小。
            if (res>214748364 || temp>7){
                //溢出返回0
                return 0;
            }
            //负整数，最小值是-2^31次方，先比较前九位大小，如果相等，在比较最后一位谁小。
            if (res<-214748364 || temp<-8){
                return 0;
            }
            //通过取模反转整数
            res=temp+res*10;
            num=num/10;
        }
        return res;
    }
}
