package Easy;

public class diagonalSum_1572 {
//    方法一、主对角线加完后，将其置为0，这样不用在判断副对角线是不是和主对角线重叠，因为重叠部分已经被置为0
//    n阶矩阵的主对角线坐标为（i，i），副对角线为（i，n-i-1）i从0开始所以要多减1，因为矩阵是用二维数组表示，数组下标从0开始
    public int diagonalSum(int[][] mat) {
        int len=mat.length;
        int sum=0;
        for (int i = 0; i < len; i++) {
            sum=sum+mat[i][i];
            mat[i][i]=0;
            sum=sum+mat[i][len-i-1];

        }
        return sum;
    }
//    方法二、先把主对角线，副对角线全部遍历相加，最后在减去重叠部分（当是奇数就减去，是偶数就减0）
public int diagonalSum2(int [][] mat){
        int len=mat.length;
        int sum=0;
        int mid=len/2;
    for (int i = 0; i < len; i++) {
        sum+=mat[i][i]+mat[i][len-i-1];

    }

        return   sum-mat[mid][mid]*(len&1);
}
}

