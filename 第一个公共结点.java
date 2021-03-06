import java.util.*;
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode current1=pHead1;
        ListNode current2=pHead2;
        HashMap<ListNode,Integer> map=new HashMap<ListNode,Integer>();
        while(current1!=null){
            map.put(current1,null);
            current1=current1.next;
        }
        while(current2!=null){
            if(map.containsKey(current2)){
                return current2;
            }
            current2=current2.next;
        }
        return null;
 
    }
}