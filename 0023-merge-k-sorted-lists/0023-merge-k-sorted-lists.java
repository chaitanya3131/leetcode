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
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode t1=list1,t2=list2;
        ListNode d=new ListNode(-1);
        ListNode t=d;
        while(t1!=null && t2!=null)
        {
            if(t1.val<=t2.val)
            {
                t.next=t1;
                t1=t1.next;
            }
            else{
                t.next=t2;
                t2=t2.next;
            }
            t=t.next;
        }
        if(t1!=null)
        {
            while(t1!=null)
            {
                t.next=t1;
                t=t.next;
                t1=t1.next;
            }
        }
        else{
            while(t2!=null)
            {
                t.next=t2;
                t=t.next;
                t2=t2.next;
            }
        }
        return d.next;
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        for(int i=lists.length-1;i>=1;i--)
        {

            ListNode temp=merge(lists[i],lists[i-1]);
            lists[i-1]=temp;
        }
        
        return lists[0];

    }
}