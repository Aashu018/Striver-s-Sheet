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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int size  = 1;
        while(temp.next!= null){
            temp = temp.next;
            size++;
        }
       
        temp.next = head;
        int r = k%size;

        //System.out.println(size);
        int rot = size-r;
        
         ListNode tem = head;
        while(rot>1){
          tem = tem.next;
            rot--;
        }
       
       head = tem.next;
       tem.next = null;
        
        return head;
    }
}