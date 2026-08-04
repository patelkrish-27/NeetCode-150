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
    public void reorderList(ListNode head) {
        if(head == null){
            return;
        }
       ListNode slow = head,fast = head;
       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }
       ListNode prev = null,curr = slow.next,temp;
        slow.next = null;
       while(curr != null){
        temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
       }
        curr = head;
        ListNode first = head,second = prev;
       while(second != null && first != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;    // Connect first to second
            second.next = temp1;    // Connect second to the rest of the first list

            first = temp1;          // Move pointers forward
            second = temp2;

       }
    }
}
