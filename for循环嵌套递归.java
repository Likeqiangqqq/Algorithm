import java.util.*;

public class Permutation {
    public ArrayList<String> getPermutation(String A) {
        ArrayList<String> list=new ArrayList<>();
        permutation(list,A.toCharArray(),0);
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }
    public void permutation(ArrayList<String> list,char[] ch,int k){
        if(k==ch.length){
            list.add(new String(ch));
        }
        for(int i=k;i<ch.length;i++){//ÿ��forѭ��һ��Ҫ��������Ȼ�ݹ鷵������˵���ǧ������˷��ص���һ���forѭ�����ܻ�û�н���
            swap(ch,i,k);
            permutation(list,ch,k+1);
            swap(ch,i,k);
        }
    }
    public void swap(char[] ch,int i,int j){
        if(i!=j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
        }
    }
}