public class Solution {
    private ArrayList<ArrayList<Integer>> listall=new ArrayList<>();
    private ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null){
            return listall;
        }
        list.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            listall.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size()-1);
        return listall;
    }
}