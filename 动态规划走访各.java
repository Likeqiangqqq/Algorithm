import java.util.*;

public class Robot {
    public int countWays(int[][] map, int x, int y) {
        if(map==null||map.length!=x||map[0].length!=y){
            return 0;
        }
        if(map[x-1][y-1] != 1 || map[0][0] != 1){//最后一个点为障碍点
        return 0;
        }
        int[][] dp=new int[50][50];
        //dp[0][0]=1;
        for(int i=1;i<x;i++){
            if(map[i][0]!=1){
                dp[i][0]=0;
            }else{
                dp[i][0]=dp[i-1][0];
            }
        }
        for(int i=1;i<y;i++){
            if(map[0][i]!=1){
                dp[0][i]=0;
            }else{
                dp[0][i]=dp[0][i-1];
            }
        }
        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                if(map[i][j]!=1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j]%1000000007+dp[i][j-1]%1000000007;
                }
            }
        }
        return dp[x-1][y-1]%1000000007;
    }
}