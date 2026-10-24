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
        ListNode temp=head,temp2=h2;
        while(temp!=null && temp2!=null)
        {
            ListNode n1=temp.next;
            ListNode n2=temp2.next;
            temp.next=temp2;
            temp2.next=n1;
            temp=n1;
            temp2=n2;
        }
    }
}