/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        if(postorder.length == 0){
            return null;
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        /* copy inorder elements */
        for(int i=0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }
        
        return build(map, 0, inorder.length-1, postorder, postorder.length-1);
    }
    
    public TreeNode build(HashMap<Integer, Integer> map, int inStart, int inEnd, int[] postorder, int postEnd){
        TreeNode node = new TreeNode(postorder[postEnd]);
        
        int pivot = map.get(node.val); 
        int leftSize = pivot - inStart; 
        int rightSize = inEnd - pivot;

        if (rightSize > 0) { 
            node.right = build(map, pivot + 1, inEnd, postorder, postEnd - 1);
        }

        if (leftSize > 0) { 
            node.left = build(map, inStart, pivot - 1, postorder, postEnd - rightSize - 1);
        }
        return node;  
    }
}