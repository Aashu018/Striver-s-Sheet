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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
       ListNode prev = null;
       ListNode pre = head;
       ListNode fut = pre.next;
       
       while(pre != null){
           pre.next = prev;
           prev = pre;
           pre = fut;
           if(fut != null){
               fut = fut.next;
           }
       }
       return prev;
    }
}