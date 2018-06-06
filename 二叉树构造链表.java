public class TreeLevel {
    ListNode ln=new ListNode(-1);
    ListNode p=ln;
    public ListNode getTreeLevel(TreeNode root, int dep) {
        if(root==null||dep<=0){
            return null;
        }
        if(dep==1){
            p.next=new ListNode(root.val);
            p=p.next;
        }else{
            getTreeLevel(root.left,dep-1);
            getTreeLevel(root.right,dep-1);
        }
        return ln.next;
    }
}