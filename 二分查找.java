import java.util.*;

public class MagicIndex {
    public boolean findMagicIndex(int[] A, int n) {
        return find(A,n,0,n-1);
    }
    public boolean find(int[] A,int n,int start,int end){
        if(start>end||start<0||end>n){
            return false;
        }
        int mid=(end-start)/2+start;
        if(A[mid]==mid){
            return true;
        }
        int leftend=Math.min(mid-1,A[mid]);
        int rightstart=Math.max(mid+1,A[mid]);
        return find(A,n,start,leftend)||find(A,n,rightstart,end);
    }
}