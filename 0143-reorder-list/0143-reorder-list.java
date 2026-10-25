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
    public ListNode rev(ListNode head)
    {
        ListNode c=head,p=null,f=null;
        while(c!=null)
        {
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;
    }
    public void reorderList(ListNode head) {
        ListNode s=head,f=head;
        while(f.next!=null && f.next.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        ListNode h2=s.next;
        s.next=null;
        h2=rev(h2);
        ListNode t1=head,t2=h2;
        while(t1!=null && t2!=null)
        {
            ListNode n1=t1.next;
            ListNode n2=t2.next;
            t1.next=t2;
            t2.next=n1;
            t1=n1;
            t2=n2;
        }

        
    }
}