public class Solution {
    public String ReverseSentence(String str) {
        if(str.trim().equals("")){
            return str;//���ǲ���ֱ�ӷ��ؿո�
        }
        String[] s=str.split(" ");
        StringBuffer sp=new StringBuffer();
        for(int i=s.length-1;i>=0;i--){
            if(i==0){
                sp.append(s[i]);
                break;
            }
            sp.append(s[i]+" ");
        }
        return sp.toString();
    }
}