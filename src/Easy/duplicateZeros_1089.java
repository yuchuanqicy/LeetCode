package Easy;

public class duplicateZeros_1089 {
    public void duplicateZeros(int[] arr) {
         int len=arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i]==0 && i+1<len){
                move(arr,i);
                arr[++i]=0;
            }

        }
    }
    public void move(int [] arr,int index){
        for (int i = arr.length-2; i >index ; i--) {
            arr[i+1]=arr[i];
        }
    }
}
