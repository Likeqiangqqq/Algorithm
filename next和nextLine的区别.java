import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=in.next();//此处不能用nextLine
        }
        boolean f1=zidian(str);
        boolean f2=length(str);
        if(f1==true&&f2==true){
            System.out.print("both");
            return;
        }else if(f1==false&&f2==true){
            System.out.print("lengths");
            return;
        }else if(f1==true&&f2==false){
            System.out.print("lexicographically");
            return;
        }else{
            System.out.print("none");
        }
         
    }
    public static boolean zidian(String[] str){
        for(int i=0;i<str.length-1;i++){
            if(str[i+1].compareTo(str[i])<0){
                return false;
            }
        }
        return true;
    }
    public static boolean length(String[] str){
        for(int i=0;i<str.length-1;i++){
            if(str[i+1].length()<str[i].length()){
                return false;
            }
        }
        return true;
    }
}