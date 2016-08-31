/**1
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> retval = new LinkedList<String>();
        
        if(root != null){
            makePaths(root, retval, "");
        }
        
        return retval;
    }
    
    public void makePaths(TreeNode root, List<String> paths, String path){
        if(root.left == null && root.right == null){
            path += String.valueOf(root.val);
            paths.add(path);
            return;
        }
        
        path += String.valueOf(root.val)+"->";
        
        if(root.left != null) {
            makePaths(root.left, paths, path);
        }
        if(root.right != null) {
            makePaths(root.right, paths, path);
        }
        
        return;
    }
}