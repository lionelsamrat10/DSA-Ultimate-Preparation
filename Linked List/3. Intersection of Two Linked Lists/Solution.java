/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // Brute Force Approach
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA != null){
            ListNode pB = headB;
            while(pB != null){
                if(headA == pB){
                    return headA;
                }
                pB = pB.next;
            }
            headA = headA.next;
        }
        return null;
    } // T(n) = O(n * m) where n is the number of nodes in list A and m is the number of nodes in list B
    
    // Better Approach
     public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        // Using Hash Table
        Set<ListNode> nodesOfBList = new HashSet<>();
        // Traverse list B and store the address/reference of each node in a hash table.
        while(headB != null){
            nodesOfBList.add(headB);
            headB = headB.next;
        }
        // Traverse the A list and check for any matching node
        while(headA != null){
            if(nodesOfBList.contains(headA)){
                return headA;
            }
            headA = headA.next;
        }
        return null;
    } // T(n) = O(n + m) where n is the number of nodes in list A and m is the number of nodes in list B
         // S(n) = O(m)    
    // Two pointer approach where m is the number of nodes in list B
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA != pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
    // T(n) = O(n + m) where n is the number of nodes in list A and m is the number of nodes in list B
    // S(n) = O(1) 
}
