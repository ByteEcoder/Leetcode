class Solution {
    public List<String> generateParenthesis(int n) {
        
      
       return solution(n,0,0,"");
    }

    public List<String> solution(int n,int open,int close,String str)

    
    {
        List<String> ll=new ArrayList<>();
        
          
            if (open == n && close == n) 
            {
                ll.add(str);
                return ll;
            
            }

            if (open<n)
            {
                ll.addAll(solution(n,open+1,close,str+"("));
            }

            if(close<open)
            {
                ll.addAll(solution(n,open,close+1,str+")"));
            }
            return ll;
        }

    
}