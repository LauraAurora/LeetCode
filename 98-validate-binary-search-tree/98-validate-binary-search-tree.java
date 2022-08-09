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
        Understand: Can there be duplicates? 
        Match: [1,2,3] = true
               [1,5,3,4,6] = false
        Plan:
 */
class Solution {
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    public boolean isValidBST(TreeNode root) {
        
        if(root == null)
            return false;
        else
            inOrder(root);

        for(int i = 1; i < list.size(); i++)
        {
            if(list.get(i) <= list.get(i-1))
                return false;
        }
        
        return true;
    }   
    
    public ArrayList<Integer> inOrder(TreeNode root)
    {
        if(root == null)
            return null;
        
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);  
        
        return list;
    }
}