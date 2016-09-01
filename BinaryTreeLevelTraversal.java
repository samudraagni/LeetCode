/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeLevelTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> retval = new LinkedList<>();
        
        if(root != null){
            Queue<TreeNode> qparent = new LinkedList<TreeNode>();
            Queue<TreeNode> qchild = new LinkedList<TreeNode>();
            
            qparent.add(root);
            
            while(qparent.peek() != null){
                List<Integer> temp = new ArrayList<Integer>();
                
                while(qparent.peek() != null){
                    TreeNode tn = qparent.poll();
                   
                    if(tn.left != null) qchild.add(tn.left);
                    if(tn.right != null) qchild.add(tn.right);
                    
                    temp.add(tn.val);
                }
                
                retval.add(temp);
                
                /* shift children to parent */
                while(qchild.peek() != null){
                    qparent.add(qchild.poll());
                }
            }
        } 
        
        return retval;
    }
}