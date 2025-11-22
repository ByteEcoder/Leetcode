class Solution {
    public boolean isPalindrome(String s) {
        String clean=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        int len=clean.length();
        
        Boolean res=Check(clean,0,len-1) ;
        return res;
    }

    public Boolean Check(String str,int start,int end)
    {   if (start<=end)
        { if (str.charAt(start)==str.charAt(end))
            {
                return Check(str,start+1,end-1);
            }
         else
            return false; 


          
        }
        
        return true;
    }
}