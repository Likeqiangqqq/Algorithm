import java.util.*;

public class Coins {
    public int countWays(int n) {
        int[] coins={1,5,10,25};
        int[] dp=new int[n+1];//从0到n数组的长度是n+1，这样才能保证凑够n的方法用dp[n]表示
        dp[0]=1;//构造0只有一种方法，就是谁都不用
        for(int i=0;i<4;i++){
            for(int j=coins[i];j<=n;j++){
                dp[j]=(dp[j]+dp[j-coins[i]])%1000000007;//凑成j的最后一枚有四种途可能，通过1、5、10、25.因此是当前值和当前值缺少某种特殊值的方法数相加
            }
        }
        return dp[n];
    }
}