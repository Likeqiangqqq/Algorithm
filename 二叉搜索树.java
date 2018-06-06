import java.util.*;

public class MinimalBST {
    public int buildMinimalBST(int[] vals) {
        if(vals.length==0){
            return 0;
        }
        return build(0,vals.length);
    }
    public int build(int start,int end){
        if(end<=start){
            return 1;
        }
        int mid=(start+end)/2;
        int h1=build(start,mid-1)+1;
        int h2=build(mid+1,end)+1;
        return Math.max(h1,h2);
    }
}