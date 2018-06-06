import java.util.*;

public class Factor {
    public int getFactorSuffixZero(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            int j=i;
            while(j%5==0){
                j/=5;
                count++;
            }
        }
        return count;
    }
}