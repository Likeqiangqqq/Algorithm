import java.util.*;

public class Finder {
    public int findElement(int[] A, int n, int x) {
        int left=0;
        int right=n-1;
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(A[mid]==x){
                return mid;
            }
            if(x>A[mid]){
                if(A[mid]<A[left]&&x>A[right]){
                    right=mid-1;//Ò»¶¨ÔÚ×ó±ß
                }else{
                    left=mid+1;
                }
            }else{
                if(A[mid]>A[left]&&x<A[left]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}