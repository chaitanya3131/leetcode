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
        ListNode h1=head;
        ListNode h2=rev(s.next);
        while(h1!=null && h2!=null)
        {
            if(h1.val!=h2.val) return false;
            h1=h1.next;
            h2=h2.next;
        }
        return true;
        
    }
}