import java.util.*;

public class Finder {
    public int[] findElement(int[][] mat, int n, int m, int x) {
        int[] result=new int[2];
        if(n==0||m==0){
            return result;
        }
        int i=0;
        int j=m-1;
        while(i<n&&j>=0){
            if(mat[i][j]<x){
                i++;
            }else if(mat[i][j]>x){
                j--;
            }else{
                result[0]=i;
                result[1]=j;
                return result;
            }
        }
        return result;
    }
}