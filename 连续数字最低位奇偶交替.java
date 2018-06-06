import java.util.*;

public class Finder {
    public int findMissing(int[][] numbers, int n) {
        for(int i=0;i<numbers.length-1;i++){
            if((numbers[i][0]^numbers[i+1][0])!=1){
                return i+1;
            }
        }
        return numbers[0].length==1&&numbers[0][0]==0?n:0;
    }
}