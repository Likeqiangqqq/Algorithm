import java.util.*;

public class Subset {
    public ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int max=1<<n;//�൱��2^n
        Arrays.sort(A);//��С��������
        for(int k=max-1;k>0;k--){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=k,index=0;i>0;i>>=1,index++){
                if((i&1)==1){//i������1λ��1���룬�൱��ѭ��ȡ��i�Ķ����Ƶ�ĩβ������ȡ���߲�ȥ��Ŀ��
                  arr.add(0,A[index]);//arr������Ϊ0��λ����ӣ�ÿ�ζ������λ�� �൱��ÿ�ζ�new
                    
                }
            }
            list.add(arr);
        }
        return list;
    }
}