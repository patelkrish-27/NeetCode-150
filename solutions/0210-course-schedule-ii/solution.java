import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int[] visited = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(graph, visited, i, path)) {
                return new int[0];
            }
        }

        int[] result = new int[path.size()];
        for (int i = 0; i < path.size(); i++) {
            result[i] = path.get(i);
        }
        return result;
    }

    private boolean dfs(List<List<Integer>> graph, int[] visited, int i, List<Integer> path) {
        if (visited[i] == 1) return false;   // currently in stack -> cycle
        if (visited[i] == 2) return true;    // already processed

        visited[i] = 1; // mark as "in progress"

        List<Integer> req = graph.get(i);
        int n = req.size();

        for (int j = 0; j < n; j++) {
            if (!dfs(graph, visited, req.get(j), path)) {
                return false;
            }
        }

        visited[i] = 2; // mark as fully processed
        path.add(i);
        return true;
    }
}
