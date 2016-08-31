/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }
    
    public boolean isValid(TreeNode p, double min, double max){
        if(p == null) return true;
        
        if(p.val <= min || p.val >= max) return false;
        
        return isValid(p.left, min, p.val) && isValid(p.right, p.val, max);
    }
}