// Problem Link:  https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length-1);
    }
    public TreeNode createBST(int[] nums, int low, int high) {
        if(low > high) return null;
        int mid = low + (high - low) / 2;
        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = createBST(nums, low, mid - 1);
        newNode.right = createBST(nums, mid + 1, high);
        return newNode;
    }
}
