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
    
    public boolean isPalindrome(ListNode head) {
        ListNode s=head,f=head;
        while(f.next!=null && f.next.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        ListNode head2=s.next;
        s.next=null;
        ListNode i=head,j=head2;
        head2=rev(head2);
        j=head2;
        while(i!=null && j!=null)
        {
            if(i.val!=j.val) return false;
            i=i.next;
            j=j.next;
        }
        return true;
        
    }
}