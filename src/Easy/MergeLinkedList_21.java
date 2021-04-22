package Easy;

import java.util.Scanner;

/**
 * @Author: yuchuanqi
 * @Date: 2021/4/12 10:39
 */

public class MergeLinkedList_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList_node_21 head=new LinkedList_node_21(1);
        head.add(2);
        head.add(3);
        head.print();
    }
    public static LinkedList_node_21 soultion(LinkedList_node_21 l1,LinkedList_node_21 l2){
        LinkedList_node_21 head=new LinkedList_node_21(1);
        if (l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }else if(l1.val>l2.val){

        }

        return l2;
    }

}
