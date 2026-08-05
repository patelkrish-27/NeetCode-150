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
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        int i = 0;
        while(i < n){
            fast = fast.next;
            i++;
        }
        while(fast != null){
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }

        if(prev != null && slow != null){
            prev.next = slow.next;
        }else if(prev == null){
            head = slow.next;
        }else{
            prev.next =  null;
        }


        return head;
    }
}
