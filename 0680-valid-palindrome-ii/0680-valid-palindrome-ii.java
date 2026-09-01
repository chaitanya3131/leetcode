class Solution {

    public boolean palin(String s,int i,int j)
    {
        while(i<j)
        {
             if(s.charAt(i)!=s.charAt(j))
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

        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return palin(s,i+1,j) || palin(s,i,j-1);

            }
            else{
                i++;
                j--;
            }
        }

        return true;


        
    }
}