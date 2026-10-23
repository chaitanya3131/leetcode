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
    public boolean isPalindrome(ListNode head) {
        ArrayList <Integer> arr=new ArrayList<> ();
        ListNode temp=head;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }
        int i=0;
        int j=arr.size()-1;
        while(i<j)
        {
            int a=arr.get(i);
            int b=arr.get(j);

            if(a!=b)
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}