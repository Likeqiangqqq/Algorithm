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
        return f(n-1)+f(n-2)+f(n-3)+f(n-4)+f(n-5)+f(n-6);//һ������n�������һ�ο���������1,2,3,4,5,6һ��6�п���
    }
}