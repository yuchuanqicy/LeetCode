package Algorithm_implementation;

/**
 * @ClassNmae SelectSort
 * @Author:yys4608
 * @Date: 2022/9/6 11:36
 * @Description:选择排序实现类
 */
public class SelectSort {
    public int [] Select_Sort(int  [] arr ){
        int len=arr.length;
        for (int i = 0; i < len-1; i++) {
            int min=i;
            int temp;
            for (int j = i+1; j < len; j++) {
                if (arr[min]>arr[j]){
                   min=j;
                }
            }
            if (min!=i){
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        return  arr;
    }
}
