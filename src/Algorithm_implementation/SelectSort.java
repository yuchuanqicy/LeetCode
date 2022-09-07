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
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int tem;
                if (arr[j]<arr[i]){
                    tem=arr[j];
                    arr[j]=arr[i];
                    arr[i]=tem;
                }
            }

        }
        return  arr;
    }
}
