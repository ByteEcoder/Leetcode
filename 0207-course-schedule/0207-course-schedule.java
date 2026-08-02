class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int degree[]=new int[numCourses];
        List<List<Integer>> graph=new ArrayList<>();    
        for(int a=0;a<numCourses;a++)
        {
            graph.add(new ArrayList<Integer>());
        }
        for(int e[]:prerequisites)
        {
            graph.get(e[1]).add(e[0]);
            degree[e[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(degree[i]==0)
                q.add(i);
        }
        int count=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            count++;
            
            for(int neigh:graph.get(node))
            {
                degree[neigh]--;
                if(degree[neigh]==0)
                    q.add(neigh);
            }
        }

        if(count==numCourses)
        return true;
        
        return false;
    }


}