/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        HashSet<ListNode> hm = new HashSet<>();
//        ListNode temp = headA;
//         while(temp != null){
//             hm.add(temp);
//             temp = temp.next;
//         }
        
//         ListNode temp2 = headB;
//         while(temp2 != null){
//             if(hm.contains(temp2)) return temp2;
//             temp2 = temp2.next;
//         }
         
//         return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        while(a != b){
            a = a==null? headB : a.next;
            b = b==null? headA : b.next;
        }
        return a;
    }
}