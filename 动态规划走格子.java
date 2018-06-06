import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        int[][] dp=new int[13][13];
        for(int i=1;i<x;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<y;i++){
            dp[0][i]=1;
        }
        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];//动态规划的关键是找出初始条件，以及最终达到目的的几种可能，本题中走到目的地可能是从上面可能是从左边，因此走法是两种之和
            }
        }
        return dp[x-1][y-1];
    }
}