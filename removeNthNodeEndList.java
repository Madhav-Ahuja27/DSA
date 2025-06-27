class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Fast and slow pointers
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps ahead so that the gap between fast and slow is n nodes
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both fast and slow until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Skip the node to be removed
        slow.next = slow.next.next;

        return dummy.next;
    }
}
