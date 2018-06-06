import java.util.*;

public class Queens {
    public int[] x;//下标i表示第i行，x[i]表示第i行皇后的位置
    public int methodNum;//方法数
    public int nQueens(int n) {
        x=new int[n+1];//从第1行开始（忽略索引0）
        backTrace(1,n);
        return methodNum;
    }
    public void backTrace(int t,int N){
        if(t>N){
            methodNum++;//当前行大于皇后数，方法成立
        }else{
            for(int i=1;i<=N;i++){
                x[t]=i;//第t行的皇后的位置从左到右遍历（从第1列到第N列）
                if(place(t)){
                   backTrace(t+1,N); 
                }
            }
        }
    }
    public boolean place(int k){
        for(int i=1;i<k;i++){
            if(Math.abs(x[i]-x[k])==Math.abs(i-k)||x[i]==x[k]){//对角线上和一个直线上则不能放（因为皇后是从第一行向下开始放，所以不存在同行的问题）
                return false;
            }
        }
        return true;
    }
}