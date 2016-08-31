/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class KthSmallestElementInABST {
    
    ArrayList<Integer> vals;
    
    public int kthSmallest(TreeNode root, int k) {
        vals = new ArrayList<Integer>();
        
        inorder(root);
        
        return vals.get(k-1);
    }
    
    private void inorder(TreeNode root){
        if(root == null) return;
        
        inorder(root.left);
        vals.add(root.val);
        inorder(root.right);
    }
}