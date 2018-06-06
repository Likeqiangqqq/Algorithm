/*前i种硬币组合成sum的方法数=前i-1种硬币，以及第i种硬币方法数的组合，这个组合取决于第i种硬币有多少个，k表示有k个，因此是dp[i-1][sum-k*coins[i]].其中k从0到sum/coins[i]*/
import java.util.Scanner;
 
/**
 * @author miss cassie
 * [编程题] 拼凑钱币
 */
public class Main {
     
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()){
            int n = s.nextInt();
            int[] coins = {1, 5, 10, 20, 50, 100};
            /** 动态规划 dp[h][i]表示由i+1中硬币组成面值为j的方法数 **/
            long dp[][] = new long[coins.length][n+1];
            for(int i = 0; i <=n; i++){
                dp[0][i] = 1;
            }
            for(int i = 1; i < coins.length; i++){
                for(int j = 1; j <= n; j++){
                    for(int k = 0; k <= j/coins[i]; k++){
                        dp[i][j] += dp[i-1][j-k*coins[i]];
                    }
                }
            }
            System.out.println(dp[coins.length-1][n]);
        }
    }
}