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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode s=head,f=head;
        ListNode a=null,b=null;
        for(int i=1;i<k;i++)
        {
            s=s.next;
        }
        a=s;
        s=head;
        f=head;
        for(int i=1;i<=k;i++)
        {
            f=f.next;
        }
        while(f!=null)
        {
            s=s.next;
            f=f.next;
        }
        b=s;
        int t;
        t=a.val;
        a.val=b.val;
        b.val=t;
        return head;
    }
}