class Solution 
{
    public boolean isPalindrome(int x) 
    {   int temp=x;
        int fin=0;
        if(x>=0)
        {
            while(x>0)
            {
                fin=fin*10+x%10;
                x=x/10;
            }
            if (fin==temp)
            {
                return true;
                
            }
            else {
                return false;
                
            }

        }
          return false;

    }
}