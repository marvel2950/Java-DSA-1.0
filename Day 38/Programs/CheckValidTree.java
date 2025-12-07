import java.util.*;

public class CheckValidTree {
    public static void main(String args[]) {
        int n = 5;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {0, 3},
                {1, 4}
        };

        boolean result = validTree(n, edges);
        System.out.println(result);
    }

    private static boolean validTree(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        return bft(map);
    }

    public static boolean bft(HashMap<Integer, List<Integer>> map) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        int c = 0;
        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            c++;
            q.add(src);
            while (!q.isEmpty()) {
//            1. remove
                int r = q.poll();
//            2. ignore if already visited
                if (visited.contains(r)) {
                    return false; // cycle
                }
//            3. marked visited
                visited.add(r);
//            4. self work
//                System.out.print(r + " ");
//            5. add unvisited neighbours
                for (int nbrs : map.get(r)) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
        return c == 1; // single component
    }
}
