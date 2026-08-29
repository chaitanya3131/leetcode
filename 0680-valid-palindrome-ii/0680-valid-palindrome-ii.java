class Solution {
     public boolean palindrome(int i,int j,String s)
        {
            while(i<j)
            {
                char left=s.charAt(i);
                char right=s.charAt(j);
                if(left!=right)
                {
                    return false;
                }
                else{
                    i++;
                    j--;
                }
            }
            return true;
        }

    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            char left=s.charAt(i);
            char right=s.charAt(j);
            if(left!=right)
            {
                return palindrome(i+1,j,s) || palindrome(i,j-1,s);
            }
            else{
                i++;
                j--;
            }
        }
        return true;
        
    }
}