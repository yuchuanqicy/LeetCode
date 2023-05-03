package main;

import java.util.Scanner;

/**
 * @Author: yuchuanqi
 * @Date: 2023/03/29/0:25
 * @Description:
 *
 * 对于任意两个正整数A和B，定义他们之间的差异值和相似值：
 * 差异值：A、B转换成二进制后，对于二进制的每一位，对应位置的bit值不相同则为1，否则为0；
 * 相似值：A、B转换成二进制后，对于二进制的每一位，对应位置的bit值都为1则为1，否则为0；
 * 现在由n个正整数A0到A（n-1），问有多少对(i,j)(0<=i<j<n),Ai和Ai的差异值大于相似值。
 * 假设A=5，B=3；则A的二进制表示101；B的二进制表示011；则A与B的差异值二进制为110；相似值二进制为001；A与B的差异值十进制等于6，相似值十进制等于1，满足条件。 使用java 求出满足差异值大于相似值的对数
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums []=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(dif(nums));
    }
    public  static  int dif1(int [] nums){
        int con=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int result1=nums[i]^nums[j];
                int result2=nums[i]&nums[j];
                System.out.printf("第"+i+"次：");
                System.out.println(result1);
                System.out.println(result2);
                if (Integer.bitCount(result1)>Integer.bitCount(result2)){
                    con++;
                }
                System.out.println("count"+con);
            }
        }
        return con;
    }
    public static int dif(int [] nums){
        int con=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int res1=nums[i]^nums[j];
                int res2=nums[i]&nums[j];
                int k=0;
                while (res1>0){
                    if ((res1&1)!=0){
                        k++;
                    }
                    res1>>=1;

                }
                if (2*k>Integer.bitCount(res2)){
                    con++;
                }
            }
        }
        return con;
    }
}