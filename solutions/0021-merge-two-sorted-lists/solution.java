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
       ListNode list3 = null;
       ListNode l1 = list1;
       ListNode l2 = list2;
       ListNode l3 = null;
       while(l1  != null && l2 != null){
        ListNode newNode = new ListNode();
        if(l1.val <= l2.val){
            newNode.val = l1.val;
            l1 = l1.next;
        }else{
            newNode.val = l2.val;
            l2 = l2.next;
        }
        if(l3 == null){
            l3 = newNode;
            list3 = l3;
        }else{
            l3.next = newNode;
            l3 = l3.next;
        }

       }
       while(l1 != null){
        ListNode newNode = new ListNode(l1.val);
        if(l3 == null){
            l3 = newNode;
            list3 = l3;
        }else{
            l3.next = newNode;
            l3 = l3.next;
        }
        l1 = l1.next;
       }
       while(l2 != null){
        ListNode newNode = new ListNode(l2.val);
        if(l3 == null){
            l3 = newNode;
            list3 = l3;
        }else{
            l3.next = newNode;
            l3 = l3.next;
        }
        l2 = l2.next;
       }

       return list3;
    }
}
