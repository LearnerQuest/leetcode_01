class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n]; 
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, color)) {
                result.add(i);
            }
        }
        return result;
    }
    private boolean dfs(int node, int[][] graph, int[] color) {
        if (color[node] != 0) {
            return color[node] == 2; 
        }
        color[node] = 1; 
        for (int nei : graph[node]) {
            if (!dfs(nei, graph, color)) {
                return false; 
            }
        }
        color[node] = 2; 
        return true;
    }

}