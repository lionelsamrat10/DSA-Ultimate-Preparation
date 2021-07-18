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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //if root is null return the empty list
        if(root == null) return result;
        //Else first add the root to the queue
        queue.add(root);
        
        while(!queue.isEmpty()){
            List<Integer> lists = new ArrayList<>();
            int size = queue.size();
            
            for(int i=0; i<size; i++){
                TreeNode current = queue.poll();
                lists.add(current.val);
                
                if(current.left != null) queue.add(current.left); 
                if(current.right != null) queue.add(current.right);
            }
            //add the list into the List Of Lists
            result.add(lists);
        }
        return result;
    }
}

// Here we are returning list of lists
