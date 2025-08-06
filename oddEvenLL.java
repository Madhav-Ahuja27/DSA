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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        if(odd==null){return odd;}
        ListNode even = head.next;
        ListNode evenHead = even;

        if(even==null) return odd;

        while(odd.next!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
