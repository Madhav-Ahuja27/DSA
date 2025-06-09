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
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(fast==null){return false;}
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next;
            slow = slow.next;
            fast=fast.next;
            if(fast==slow){return true;}
        }
        return false;
    }
}
