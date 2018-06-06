/*ǰi��Ӳ����ϳ�sum�ķ�����=ǰi-1��Ӳ�ң��Լ���i��Ӳ�ҷ���������ϣ�������ȡ���ڵ�i��Ӳ���ж��ٸ���k��ʾ��k���������dp[i-1][sum-k*coins[i]].����k��0��sum/coins[i]*/
import java.util.Scanner;
 
/**
 * @author miss cassie
 * [�����] ƴ��Ǯ��
 */
public class Main {
     
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()){
            int n = s.nextInt();
            int[] coins = {1, 5, 10, 20, 50, 100};
            /** ��̬�滮 dp[h][i]��ʾ��i+1��Ӳ�������ֵΪj�ķ����� **/
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