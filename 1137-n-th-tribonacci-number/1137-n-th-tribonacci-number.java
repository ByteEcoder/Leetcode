class Solution {
    public int tribonacci(int n) {
            
            int[] res=new int[n+1];
            Arrays.fill(res,-1);
            return check(n,res);
    }
    public int check(int i,int[] res){
        if (i==0)
            return res[i]=0;
        if (i<=2)
            return res[i]=1;
        if (res[i]!=-1) 
            return res[i];

        int a=check(i-1,res);
        int b=check(i-2,res);
        int c=check(i-3,res);

        return res[i]=a+b+c;
    }
    
}