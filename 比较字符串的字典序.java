import java.util.*;

public class Finder {
    public int findString(String[] str, int n, String x) {
        int left=0;
        int right=n-1;
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(str[mid].equals(x)){
                return mid;
            }
            if(x.compareTo(str[mid])<0){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}