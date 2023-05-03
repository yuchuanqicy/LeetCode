package main;

import java.util.Scanner;
import  java.math.*;
/**
 * @Author: yuchuanqi
 * @Date: 2023/03/28/23:32
 * @Description:
 *
 * Maven版本号定义，<主版本>.<次版本>.<增量版本>-<里程碑版本>，举例3.1.4-beta，其中，主版本和次版本都是必须的，
 * 主版本，次版本，增量版本由多位数字组成，可能包含前导零，里程碑版本由字符串组成。<主版本>.<次版本>.<增量版本>：基于数字比较，里
 * 程碑版本：基于字符串比较，采用字典序，比较版本号时，按从左到右的顺序依次比较。基于数字比较，只需比较忽略任何前导零后的整数值。输入2个版本号，输出最大版本号
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(Max_Version(str1,str2));
    }
    public static String Max_Version(String str1,String str2){
        String [] v1=str1.split("-");
        String [] v2=str2.split("-");
        String [] n1=v1[0].split("\\.");
        String [] n2=v2[0].split("\\.");
        int len=Math.max(n1.length,n2.length);
        for (int i = 0; i < len; i++) {
            int num1=i<n1.length ? Integer.parseInt(n1[i]) :0;
            int num2=i<n2.length ?Integer.parseInt(n2[i]):0;
            if (num1!=num2){
                return  num1>num2?str1:str2;
            }
        }
        if (n1.length==2 && n2.length==2){
            String maxV=v1[1].compareTo(v2[1])>0?str1:str2;
            return maxV;
        }
        if (v1.length==2 || v1.length==1){
            String maxv1= v1.length==2 ?str1:str2;
        }
        return str1;
    }

}
