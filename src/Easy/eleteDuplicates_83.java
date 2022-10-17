package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/10/17/22:54
 * @Description:
 */
public class eleteDuplicates_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return head;
        }
        ListNode pre=head;
        while (pre.next!=null){
            if (pre.val==pre.next.val){
                pre.next=pre.next.next;
            }else {
                pre=pre.next;
            }
        }
        return head;
    }
}
