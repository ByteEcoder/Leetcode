class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q=new LinkedList<>();
        boolean visit[]=new boolean[rooms.size()];
        q.add(0);
        visit[0]=true;

        while(!q.isEmpty())
        {
            int node=q.poll();  

            for(int neigh:rooms.get(node)) 
            {
                if(visit[neigh]==false)
                {   visit[neigh]=true;
                    q.add(neigh);
                }
            }
        }

        for(int i=0;i<rooms.size();i++)
        {
            if(visit[i]==false)
                return false;
        }

        return true;
    }
}