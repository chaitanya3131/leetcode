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
    public int len(ListNode head)
    {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        return c;
    }
    public ListNode oddEvenList(ListNode head) {
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-1);
        ListNode t=head,t1=d1,t2=d2;
        int n=len(head);
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                t1.next=t;
                t1=t1.next;
            }
            else
            {
                t2.next=t;
                t2=t2.next;
            }
            t=t.next;
        }
        t1.next=null;
        t2.next=null;
        t1.next=d2.next;
        return d1.next;
        
    }
}