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
    int currNum=0;
    int currFreq=0;
    int maxFreq=0;
    List<Integer> res=new ArrayList<>();
    void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        if(root.val==currNum){
            currFreq++;
        }else{
            currNum=root.val;
            currFreq=1;
        }
        if(currFreq>maxFreq){
            res.clear();
            maxFreq=currFreq;
        }
        if(currFreq==maxFreq){
            res.add(root.val);
        }
        inorder(root.right);
    }
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;

    }
}