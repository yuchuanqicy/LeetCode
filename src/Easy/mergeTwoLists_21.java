package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/10/10/21:31
 * @Description:
 */
public class mergeTwoLists_21 {
        public class ListNode {
         int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode Head=new ListNode(-1);
        ListNode pre=Head;
        if (list1==null){
            return list2;
        }else if (list1==null){
            return list1;
        }
        while (list1!=null && list2!=null ){
            if (list1.val<=list2.val){
                pre.next=list1;
                pre=list1;
                list1=list1.next;
            }else {
                pre.next=list2;
                pre=list2;
                list2=list2.next;
            }
        }
        pre.next=list1==null?list2:list1;
        return Head.next;
    }
}
