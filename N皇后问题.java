import java.util.*;

public class Queens {
    public int[] x;//�±�i��ʾ��i�У�x[i]��ʾ��i�лʺ��λ��
    public int methodNum;//������
    public int nQueens(int n) {
        x=new int[n+1];//�ӵ�1�п�ʼ����������0��
        backTrace(1,n);
        return methodNum;
    }
    public void backTrace(int t,int N){
        if(t>N){
            methodNum++;//��ǰ�д��ڻʺ�������������
        }else{
            for(int i=1;i<=N;i++){
                x[t]=i;//��t�еĻʺ��λ�ô����ұ������ӵ�1�е���N�У�
                if(place(t)){
                   backTrace(t+1,N); 
                }
            }
        }
    }
    public boolean place(int k){
        for(int i=1;i<k;i++){
            if(Math.abs(x[i]-x[k])==Math.abs(i-k)||x[i]==x[k]){//�Խ����Ϻ�һ��ֱ�������ܷţ���Ϊ�ʺ��Ǵӵ�һ�����¿�ʼ�ţ����Բ�����ͬ�е����⣩
                return false;
            }
        }
        return true;
    }
}