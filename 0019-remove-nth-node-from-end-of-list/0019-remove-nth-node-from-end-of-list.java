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
       ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: Calculate the position from the start (0-indexed)
        int steps = count - n;

        // Special case: if the node to remove is the head
        if (steps == 0) {
            return head.next;
        }

        // Step 3: Traverse to the node before the one to remove
        temp = head;
        for (int i = 1; i < steps; i++) {
            temp = temp.next;
        }

        // Step 4: Remove the nth node from the end
        temp.next = temp.next.next;

        return head;
    }
}