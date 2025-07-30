class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that points to the head to handle deletions at the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Use a current pointer to traverse the list
        ListNode curr = dummy;

        while (curr.next != null) {
            if (curr.next.val == val) {
                // Skip the node with the value
                curr.next = curr.next.next;
            } else {
                // Move to the next node
                curr = curr.next;
            }
        }

        // Return the new head (might have changed)
        return dummy.next;
    }
}
