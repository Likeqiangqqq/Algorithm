import java.util.*;

public class CloseNumber {
    public int[] getCloseNumber(int x) {
        int[] res=new int[2];
        int num=getOne(x);
        int left=x-1;
        int right=x+1;
        while(left!=0){
            int leftNum=getOne(left);
            if(leftNum==num){
                res[0]=left;
                break;
            }
            left--;
        }
         while(right!=0){
            int rightNum=getOne(right);
            if(rightNum==num){
                res[1]=right;
                break;
            }
            right++;
        }
        return res;
    }
    public int getOne(int x){
        int count=0;
        while(x!=1){
            if(x%2!=0){
                count++;
            }
            x/=2;
        }
        return count+1;
    }
}