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
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode swapPairs(ListNode head) {
        int n=len(head);
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-1);

        ListNode t1=d1,t2=d2,t=head;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                t1.next=t;
                t1=t1.next;
            }
            else{
                t2.next=t;
                t2=t2.next;
            }
            t=t.next;
        }
        t1.next=null;
        t2.next=null;
        ListNode m1=d1.next;
        ListNode m2=d2.next;
        ListNode d=new ListNode(-1);
        ListNode k=d;
        while(m1!=null && m2!=null)
        {
           ListNode n1=m1.next;
           ListNode n2=m2.next;
           k.next=m2;
           m2.next=m1;
           k=m1;
           m1=n1;
           m2=n2;
        }
        if(m1!=null)
        {
            k.next=m1;
        }
        else{
            k.next=m2;
        }
        return d.next;

    }
}