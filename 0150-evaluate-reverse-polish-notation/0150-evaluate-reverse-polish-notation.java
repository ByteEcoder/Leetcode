class Solution {
    public int evalRPN(String[] tokens) {
        int res=0;
        Stack<Integer> s=new Stack<>();
        if(tokens.length==1)
            return Integer.parseInt(tokens[0]);
        for(String i:tokens)
        {
            if(i.equals("+"))
                {int a=s.pop();
                int b=s.pop();
                res=a+b;
                s.push(res);
                }
            else if(i.equals("-"))
               { 
                int a=s.pop();
                int b=s.pop();
                res=b-a;
                    s.push(res);
               }
            else if(i.equals("/")){
                
                int a=s.pop();
                int b=s.pop();
                res=b/a;
                s.push(res);
                }
            else if(i.equals("*")){
               int a=s.pop();
                int b=s.pop();
                res=a*b;
               
                s.push(res);
                }
            else
                s.push(Integer.parseInt(i));




        }

        return res;
    }
}