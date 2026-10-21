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
        ListNode p=null,f=null,c=head;
        while(c!=null)
        {
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;
        
    }
}