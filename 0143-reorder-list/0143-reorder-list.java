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
    public void reorderList(ListNode head){
           if (head.next == null || head.next.next == null) return;
        ListNode tempHead = head;
        while (tempHead.next != null && tempHead.next.next != null) {
            tempHead = tempHead.next;
        }

        ListNode test = tempHead;
        ListNode next = head.next;

        head.next = test.next;
        test.next.next = next;
        test.next = null;
        head = next;
        reorderList(head);
    }
}
    
