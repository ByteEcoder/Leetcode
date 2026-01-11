class MyStack {
Queue<Integer> q=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        if(q.size()>1)
        {
            int n=q.size();
            while(n>1)
            {
                q.add(q.poll());
                n--;
            }
        }
        return q.poll();
    }
    
    public int top() {
        if(q.size()>1)
        {
            int n=q.size();
            while(n>1)
            {
                q.add(q.poll());
                n--;
            }
        }
        int res=q.peek();
        q.add(q.poll());
        return res;
        
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */