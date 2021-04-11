package Easy;

import java.util.Scanner;
//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。

// 示例 1：

//输入：x = 121
//输出：true

// 示例 2：

//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

// 示例 3：

//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。

// 示例 4：

//输入：x = -101
//输出：false

// 提示：
// -231 <= x <= 231 - 1

// 进阶：你能不将整数转为字符串来解决这个问题吗？
// Related Topics 数学
// 👍 1455 👎 0

/**
 * @Author: wangqi
 * @Date: 2021/4/9 17:16
 */

public class palindrome_9 {
    public static void main(String[] args) {
        System.out.println("回文解决方案：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Boolean result = soulation1(num);
        System.out.println("是否是回文：" + result);
        System.out.println("==============");
        Boolean result1=soulation2(num);
        System.out.println(result1);
    }

    /*方法一直接转换成数组，反转数组*/
    public static Boolean soulation1(int num) {
        String s = String.valueOf(num);
        String sb = new StringBuilder(s).reverse().toString();
        if (s.equals(sb)) {
            return true;
        } else {
            return false;
        }
    }

    /*方法二*/
    public static Boolean soulation2(int num) {
        if (num<0){
            return false;
        }
        int x=0;
        int temp=num;
        while (num>0){
            x=x*10+num%10;
            num/=10;
        }
        if (x==temp){
            return true;
        }else{
            return false;
        }
    }
}
