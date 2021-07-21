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
    public ListNode sortList(ListNode head) {
        // If the head is NULL or there is only one element in the Linked List then return.
        if(head == null || head.next == null) return head;
        // Get the mid of the list
        ListNode mid = getMiddle(head);
        // Call the sort function for left side of the list
        ListNode left = sortList(head);
        // Call the sort function for right side of the list
        ListNode right = sortList(mid);
        // Call the merge function
        return merge(left, right);
    }
    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }
    public ListNode getMiddle(ListNode head) {
        /*if(head == null) return head;
        ListNode slow = head, fast = head;
         
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;*/
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
     }
}
