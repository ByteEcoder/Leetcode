class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int outdegree[] = new int[n];
        Queue<Integer> q = new ArrayDeque<>();
        List<List<Integer>> rev = new ArrayList<>();

        for (int u = 0; u < n; u++) {
            rev.add(new ArrayList<>());
        }

        for (int u = 0; u < n; u++) {
            for (int v : graph[u]) {
                rev.get(v).add(u);
                outdegree[u]++;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int c = 0; c < n; c++) {
            if (outdegree[c] == 0)
                q.add(c);
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            res.add(node);

            for (int neigh : rev.get(node)) {

                outdegree[neigh]--;

                if (outdegree[neigh] == 0)
                    q.add(neigh);
            }
        }
        Collections.sort(res);
        return res;
    }
}