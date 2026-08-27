class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        while(n!=0)
        {
            int k=n%10;
            rev=rev*10+k;
            n=n/10;
        }
        if(x<0)
        {
            return false;
        }
        else if(rev==x)
        {
            return true;
        }
        else {
            return false;
        }
        
    }
}