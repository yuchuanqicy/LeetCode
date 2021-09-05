package Heap;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author: yuchuanqi
 * @Date: 2021/09/05
 * @Description: 实现大根堆的操作,借助list集合进行操作
 * https://www.iteye.com/blog/128kj-1728555
 */
public class MaxHeap {
    /***
     * @param: [heap, data]
     * @return: void
       @describe: 插入操作
     */
    public static void  insert(List<Integer> heap,int data){
//        使下标从1开始，为了和节点一一对应
        if (heap.size()==0){
            heap.add(0);
        }
//      每次通过list集合，在尾部添加，为了维持完全二叉树形式
        heap.add(data);
        compare(heap,heap.size()-1);

    }
    /***
     * @param: [heap, index]
     * @return: void
       @describe: 和根节点比较，大于根节点与跟节点进行交换
     */
    public static void  compare(List<Integer> heap,int index){
        //下标从1开始
        if (index>1){
//           根据子节点与父节点的关系，求出父节点，
            int parent=index/2;
//           获取父节点和当前要比较的值
            int parentData = heap.get(parent);
            int curData= heap.get(index);
//           如果父节点小于当前值，进行一次heapify
            if (parentData <curData){
                heapify(heap,parent,index);
//                递归调用，直到根节点，为递归出口
                compare(heap,index);
            }
        }
    }
    /***
     * @param: [heap, childData, index]
     * @return: void
       @describe: 交换父节点与字节的的值，并且改变下标indedx的值指向父节点的位置
     */
    private static void heapify(List<Integer> heap, int parent, int index) {
        int temp=heap.get(parent);
        heap.set(parent,heap.get(index));
        heap.set(index,temp);
    }
    /***
     * @param: [heap, index]
     * @return: void
       @describe: 删除某个位置的节点
     */
    public static void  del(List<Integer> heap,int index){
//        将最后一个叶子节点的值赋值给删除的位置，同样是为了维持完全二叉树的形式
        heap.set(index,heap.get(heap.size()-1));
        heapifyDel(heap,index);
//        砍断最后一个节点
        heap.remove(heap.size()-1);
    }
/***
 * @param: [heap, index]
 * @return: void
   @describe: 在删除时候，最后的叶子节点与删除位置进行交换
 */
    private static void heapifyDel(List<Integer> heap, int index) {
//        下标从1开始
        int lenth=heap.size()-2;
        int child=-1;
        if (index*2>lenth){
            return;
        } else if (2*index<lenth){
            child=2*index;
//            左右孩子比较，左孩子小于右孩子，取右节点
            if (heap.get(child)<heap.get(child+1)){
                child++;
            }else if (2*index==lenth){
                child=2*index;
            }

        }
        if (heap.get(child)>heap.get(index)){
            heapify(heap,child,index);
        }
        heapifyDel(heap,child);
    }
//    排序
    public static void  heapSort(List<Integer> heap){
        for (int i = heap.size()-1; i >0; i--) {
            heapify(heap,1,i);
            adjust(heap,1,i-1);
        }
    }
    /***
     * @param: [List]
     * @return: void
       @describe: 输出列表
     */
    public  static void  display_List(List<Integer> List){
        for (int i=1;i<List.size();i++){
            System.out.println(List.get(i)+",");
        }
    }
    /***
     * @param: [heap]
     * @return: void
       @describe:
     */
    public static void CreateMaxHeap(List<Integer> heap){
        for (int i = heap.size() / 2; i > 0; i--){
            adjust(heap,i, heap.size()-1);
        }

        System.out.println("=================================================");
        System.out.println("调整后的初始堆：");
        display_List(heap);
    }
    public static void adjust(List<Integer> heap,int index,int lenth){
        int child;
        for (; index <= lenth / 2; ) {
            child = index * 2;
            if(child+1<=lenth && heap.get(child)<heap.get(child+1))
                child+=1;/*使child指向值较大的孩子*/
            if(heap.get(index)< heap.get(child)){
                heapify(heap,index, child);
                /*交换后，以child为根的子树不一定满足堆定义，所以从child处开始调整*/
                index = child;

            }  else break;
        }
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

    }

}
