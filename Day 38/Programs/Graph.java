import java.util.*;

public class Graph {
    protected HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
//        HashMap<Integer, Integer>  innerMap1 = map.get(v1);
//        innerMap1.put(v2, cost);
//
//        HashMap<Integer, Integer>  innerMap2 = map.get(v2);
//        innerMap2.put(v1, cost);

        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean containsEdge(int v1, int v2) {
//        HashMap<Integer, Integer>  innerMap = map.get(v1);
//        return innerMap.containsKey(v2);

        return map.get(v1).containsKey(v2);
    }

    public boolean containsVertex(int v1) {
        return map.containsKey(v1);
    }

    public int noOfEdges() {
        int sum = 0;
        for (int vertex : map.keySet()) {
            HashMap<Integer, Integer> innerMap = map.get(vertex);
            sum = sum + innerMap.size();
        }
        return sum / 2;
    }

    public void removeEdge(int v1, int v2) {
        HashMap<Integer, Integer> innerMap1 = map.get(v1);
        innerMap1.remove(v2);

        HashMap<Integer, Integer> innerMap2 = map.get(v2);
        innerMap2.remove(v1);
    }

    public void removeVertex(int v) {
        map.remove(v);
        for (int vertex : map.keySet()) {
            HashMap<Integer, Integer> innerMap = map.get(vertex);
            innerMap.remove(v);
        }
    }

    public boolean hasPath(int source, int target, HashSet<Integer> visited) {
        if (source == target) {
            return true;
        }
        visited.add(source);
        for (int nbrs : map.get(source).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = hasPath(nbrs, target, visited);
                if (ans) {
                    return true;
                }
            }
        }
        return false;
    }

    public void findAllPaths(int source, int target, HashSet<Integer> visited, String ans) {
        if (source == target) {
            ans = ans + target;
            System.out.println(ans);
            return;
        }
        visited.add(source);
        for (int nbrs : map.get(source).keySet()) {
            if (!visited.contains(nbrs)) {
                findAllPaths(nbrs, target, visited, ans + source + " -> ");
            }
        }
        visited.remove(source);
    }

    public boolean bfs(int src, int des) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        HashSet<Integer> visited = new HashSet<>();

        while (!q.isEmpty()) {
//        1. remove
            int r = q.poll();

//        2. ignore if already visited
            if (visited.contains(r)) {
                continue;
            }

//        3. marked visited
            visited.add(r);

//        4. self work
            if (r == des) {
                return true;
            }

//        5. add unvisited neighbours
            for (int nbrs : map.get(r).keySet()) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }
        }
        return false;
    }

    public boolean bfsCycle() {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        int source = 0;
        for (int vertex : map.keySet()) {
            source = vertex;
            break;
        }
        q.add(source);

        while (!q.isEmpty()) {
//        1. remove
            int r = q.poll();

//        2. ignore if already visited
            if (visited.contains(r)) {
                return true;
//                continue;
            }

//        3. marked visited
            visited.add(r);

//        4. self work
//            if(r == des) {
//                return true;
//            }

//        5. add unvisited neighbours
            for (int nbrs : map.get(r).keySet()) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }
        }
        return false;
    }

    public int bfsCycleCount() {
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        int source = 0;
        for (int vertex : map.keySet()) {
            source = vertex;
            break;
        }
        q.add(source);

        while (!q.isEmpty()) {
//        1. remove
            int r = q.poll();

//        2. ignore if already visited
            if (visited.contains(r)) {
                count++;
                continue;
            }

//        3. marked visited
            visited.add(r);

//        4. self work
//            if(r == des) {
//                return true;
//            }

//        5. add unvisited neighbours
            for (int nbrs : map.get(r).keySet()) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }
        }
        return count;
    }

    public boolean dfs(int src, int des) {
        Stack<Integer> st = new Stack<>();
        st.push(src);
        HashSet<Integer> visited = new HashSet<>();

        while (!st.isEmpty()) {
//        1. remove
            int r = st.pop();

//        2. ignore if already visited
            if (visited.contains(r)) {
                continue;
            }

//        3. marked visited
            visited.add(r);

//        4. self work
            if (r == des) {
                return true;
            }

//        5. add unvisited neighbours
            for (int nbrs : map.get(r).keySet()) {
                if (!visited.contains(nbrs)) {
                    st.add(nbrs);
                }
            }
        }
        return false;
    }

    public void bft() {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        for (int src : map.keySet()) {
            if(visited.contains(src)) {
                continue;
            }
            q.add(src);
            while (!q.isEmpty()) {
//            1. remove
                int r = q.poll();
//            2. ignore if already visited
                if (visited.contains(r)) {
                    continue;
                }
//            3. marked visited
                visited.add(r);
//            4. self work
                System.out.print(r + " ");
//            5. add unvisited neighbours
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
        System.out.println();
    }


}

















