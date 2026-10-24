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
    public int pairSum(ListNode head) {

        ListNode s=head,f=head;
        while(f.next.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        ListNode head2=s.next;
        head2=rev(head2);
        int max=-1;
        while(head!=null && head2!=null)
        {
            if((head.val+head2.val)>max)
            {
                max=head.val+head2.val;
            }
            head=head.next;
            head2=head2.next;
        }
        return max;

        
    }
}