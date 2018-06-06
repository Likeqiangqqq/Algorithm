import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Long x=in.nextLong();
        System.out.print(F(x));
    }
    public static int F(Long x){
        Queue<Long> q=new LinkedList<>();
        HashMap<Long,Integer> map=new HashMap<>();
        q.add(x);
        map.put(x,0);
        while(!q.isEmpty()){
            Long n=q.poll();
            int m=map.get(n);
            if(n==0){
                return m;
            }
            if(m>100000){
                break;
            }
            if(!map.containsKey((4*n+3)%1000000007)){
                map.put((4*n+3)%1000000007,m+1);//mapÿ�δ洢��һ�ε�value��m����һ��key��value��ʵ�����ۼ�
                q.offer((4*n+3)%1000000007);
            }
            if(!map.containsKey((8*n+7)%1000000007)){
                map.put((8*n+7)%1000000007,m+1);
                q.offer((8*n+7)%1000000007);
            }
              
              
        }
        return -1;
    }
}