import java.util.*;

public class Stack {
    public int getHeight(int[] men, int n) {
        int[] dp=new int[n];
        dp[0]=1;
        int longest=0;
        for(int i=1;i<n;i++){
            int subindex=0;
            int sublong=0;
            while(subindex<i){
                if(men[i]>men[subindex]){
                    sublong=Math.max(sublong,dp[subindex]);
                    
                }
                subindex++;
            
            }
            dp[i]=sublong+1;
            longest=Math.max(longest,dp[i]);
        }
        return longest;
    }
}