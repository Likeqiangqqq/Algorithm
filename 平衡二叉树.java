public class Solution {
    private boolean IsBalance=true;
    public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return IsBalance;
    }
    public int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=getDepth(root.left)+1;
        int right=getDepth(root.right)+1;
        if(Math.abs(right-left)>1){
            IsBalance=false;
        }
        return Math.max(left,right);
    }
}