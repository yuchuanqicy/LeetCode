package main;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] power=new int[n];
//        for (int i = 0; i < n; i++) {
//            power[i]=sc.nextInt();
//        }
//        int Max=sc.nextInt();
//        System.out.println(power_Max(power,Max,n));
    }


    public static int power_Max(int [] Powers,int Max,int n){
        boolean [][] arr=new boolean[n+1][Max+1 ];
        arr[0][0] =true;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=Max; j++) {
                if (j>=Powers[i-1]){
                    arr[i][j]=arr[i-1][j] || arr[i-1][j-Powers[i-1]];
                }else {
                    arr[i][j]=arr[i-1][j];
                }
            }
        }
        int MaxPower=0;
        for (int j = Max; j >=0 ; j--) {
            if (arr[n][j]){
                MaxPower=j;
                break;
            }
        }
        return MaxPower;
    }
}