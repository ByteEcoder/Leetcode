class Solution {
    public int climbStairs(int n) {
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
        return check(n,arr);
    }
    public int check(int n,int[] arr)
    {
        if(n==1||n==0)
            return 1;
        
        if(arr[n]!=-1)
            return arr[n];
        int a = check(n-1,arr);
        int b = check(n-2,arr);

        return arr[n]=a+b;
    }
}