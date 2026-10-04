/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0,l2=0;
        ListNode temp1=headA,temp2=headB;
        while(temp1!=null)
        {
            temp1=temp1.next;
            l1++;
        }
        while(temp2!=null)
        {
            temp2=temp2.next;
            l2++;
        }
        temp1=headA;
        temp2=headB;
        if(l2>l1)
        {
            int adv=l2-l1;
            for(int i=1;i<=adv;i++)
            {
                temp2=temp2.next;
            }
        }
        else{
            int adv=l1-l2;
            for(int i=1;i<=adv;i++)
            {
                temp1=temp1.next;
            }
        }
        while(temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
        
    }
}