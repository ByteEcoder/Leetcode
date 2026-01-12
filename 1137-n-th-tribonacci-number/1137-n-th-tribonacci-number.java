class Solution {
    public int tribonacci(int n) {
            return check(n);
    }
    public int check(int i){
        if (i==0)
            return 0;
        if(i<=2)
            return 1;

        int a=check(i-1);
        int b=check(i-2);
        int c=check(i-3);

        return a+b+c;
    }
}