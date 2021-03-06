public class Successor {
    public int findSucc(TreeNode root, int p) {
        boolean isFound = false;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            if(!stack.isEmpty()){
                TreeNode q = stack.pop();
                if(isFound) return q.val;
                else if(q.val==p) isFound = true;
                cur = q.right;
            }
        }
        return -1;
    }       
}
