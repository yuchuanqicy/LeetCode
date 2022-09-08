package main;
import Algorithm_implementation.Bubble_Sort;
import Algorithm_implementation.SelectSort;
import Easy.RecentCounter_933;
import Easy.binaryGap_868;
import Medium.Solution_398;
import Medium.lengthLongestPath_388;
import java.util.Arrays;
import  Easy.toGoatLatin_824;

/**
 * @Author: yuchuanqi
 * @Date: 2022/04/20/22:50
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Bubble_Sort bubble_sort=new Bubble_Sort();
        SelectSort selectSort=new SelectSort();
        int [] test=new int[]{20,32,6,1,8,9,10};
        System.out.println(Arrays.toString(selectSort.Select_Sort(test)));
    }
}
