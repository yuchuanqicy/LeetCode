package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2021/4/12 10:47
 */

public class LinkedList_node_21 {
    public int  val;
    public LinkedList_node_21  next;

    public LinkedList_node_21(int i) {
        val=i;
    }

    public void add(int node){
        LinkedList_node_21 newnode=new LinkedList_node_21(node);

        if (this.next==null){
            this.next=newnode;
        }else {
            this.next.add(node);
        }
    }
    public void print(){
        System.out.print(this.val);
        if (this.next !=null){
            System.out.print("->");
            this.next.print();
        }
    }
}
