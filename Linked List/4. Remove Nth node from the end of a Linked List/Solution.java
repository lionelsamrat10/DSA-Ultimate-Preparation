/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        int len = 0;
        ListNode firstNode = head;
        
        while(firstNode != null){
            len++;
            firstNode = firstNode.next;
        }
        //We have to loop through until len - n
        len -= n;
        firstNode = dummyNode;
        //Iterate upto len - n
        while(len > 0){
            len--;
            firstNode = firstNode.next;
        }
        firstNode.next = firstNode.next.next;
        return dummyNode.next;
    }
}
