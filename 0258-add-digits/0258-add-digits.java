class Solution {
    public int addDigits(int num) {
        
        
        int res=0;
        while(num>0)
        {

            res+=num%10;
            num=num/10;

            while(res>9)
            {
                int a=res%10;
                int b=res/10;
                res=a+b;
            }
        }

        return res;
    }
}