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
       /* if(head == null){
            return head;
        }
        
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
       // System.out.println(count);
        if(count == 1 && n==1){
            head = null;
            return head;
        }
        if(count == n){
            head = head.next;
            return head;
        }
        temp = head;
        for(int i=1;i<count-n;i++){
           temp = temp.next; 
        }
        temp.next = temp.next.next;
        return head;*/
        
        // optimal approach
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;
        
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        
        while(fast.next != null){
            slow = slow.next;
            fast= fast.next;
        }
        
        slow.next = slow.next.next;
        
        return start.next;
                   
        
    }
}