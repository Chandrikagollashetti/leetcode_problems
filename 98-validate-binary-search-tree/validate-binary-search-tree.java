/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        inorder(root,ans);
        boolean isValidBST=true;
        int prev=ans.get(0);
        for(int i=1;i<ans.size();i++){
            if(ans.get(i)<=prev)
            isValidBST=false;
            prev=ans.get(i);
        }
        return isValidBST;
    }
    void inorder(TreeNode root, List<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}
