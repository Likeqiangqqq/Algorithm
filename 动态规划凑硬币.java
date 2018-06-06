import java.util.*;

public class Coins {
    public int countWays(int n) {
        int[] coins={1,5,10,25};
        int[] dp=new int[n+1];//��0��n����ĳ�����n+1���������ܱ�֤�չ�n�ķ�����dp[n]��ʾ
        dp[0]=1;//����0ֻ��һ�ַ���������˭������
        for(int i=0;i<4;i++){
            for(int j=coins[i];j<=n;j++){
                dp[j]=(dp[j]+dp[j-coins[i]])%1000000007;//�ճ�j�����һö������;���ܣ�ͨ��1��5��10��25.����ǵ�ǰֵ�͵�ǰֵȱ��ĳ������ֵ�ķ��������
            }
        }
        return dp[n];
    }
}