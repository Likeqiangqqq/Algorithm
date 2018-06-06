import java.util.*;

public class Subset {
    public ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int max=1<<n;//相当于2^n
        Arrays.sort(A);//从小到大排序
        for(int k=max-1;k>0;k--){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=k,index=0;i>0;i>>=1,index++){
                if((i&1)==1){//i向右移1位与1相与，相当于循环取出i的二进制的末尾数，起到取或者不去的目的
                  arr.add(0,A[index]);//arr中索引为0的位置添加，每次都是这个位置 相当于每次都new
                    
                }
            }
            list.add(arr);
        }
        return list;
    }
}