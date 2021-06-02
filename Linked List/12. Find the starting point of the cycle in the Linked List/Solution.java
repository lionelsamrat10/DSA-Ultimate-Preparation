/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// Used the Cycle Finding algorithm of Floyd 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                //Means we have a cycle in the Linked List
                break;
            }
        }
        // We can't have the cycle
        if(slow != fast){
            return null;
        }
        slow = head;
        //The Slow pointer will point to the starting node of the cycle in the linked list
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
