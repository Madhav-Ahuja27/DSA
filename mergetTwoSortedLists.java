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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(list1!=null){
            arr.add(list1.val);
           list1=list1.next; 
        }
        while(list2!=null){
            arr.add(list2.val);
           list2=list2.next; 
        }

        Collections.sort(arr);

        if(arr.size()==0) return null;
        ListNode head = new ListNode(arr.get(0));
        ListNode temp = head;
        for(int i=1;i<arr.size();i++){
            ListNode curr = new ListNode(arr.get(i));
            temp.next = curr;
            temp = curr;
        }
        return head;
    }
}
