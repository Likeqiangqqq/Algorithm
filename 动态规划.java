import java.util.*;

public class GoUpstairs {
    public int countWays(int n) {
        int[] arr=new int[100000];
        for(int i=0;i<100000;i++){
            arr[i]=0;
        }
        arr[1]=1;
        arr[2]=2;
        arr[3]=4;
        for(int i=4;i<=n;i++){
            arr[i]=((arr[i-1]+arr[i-2])%1000000007+arr[i-3])%1000000007;
        }
        return arr[n];
        
    }
}