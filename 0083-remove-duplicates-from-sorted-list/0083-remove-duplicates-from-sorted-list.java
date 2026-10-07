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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode i=head,j=head;
        while(j!=null)
        {
            if(i.val==j.val)
            {
                j=j.next;
            }
            else if(i.val!=j.val)
            {
                i.next=j;
                i=j;
            }
        }
        if(i!=null)
        {
             i.next=j;
        }
        return head;
        
    }
}