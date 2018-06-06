import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str="";
        int left=-90;
        int center=0;
        int right=90;
        for(int i=0;i<6;i++){
            center=(left+right)/2;
            if(n>=left&&n<center){
                right=center;
                str+="0";
            }
            if(n<=right&&n>=center){
                left=center;
                str+="1";
            }
        }
        System.out.print(str);
    }
}