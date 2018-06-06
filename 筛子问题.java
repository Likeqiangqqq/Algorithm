import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print(f(n));
    }
    public static int f(int n){
        if(n<0){
            return 0;
        }else if(n==0){
            return 1;
        }
        return f(n-1)+f(n-2)+f(n-3)+f(n-4)+f(n-5)+f(n-6);//一共走了n步，最后一次可能是走了1,2,3,4,5,6一共6中可能
    }
}