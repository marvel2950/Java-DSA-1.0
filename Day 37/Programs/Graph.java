import java.util.HashMap;
import java.util.HashSet;

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
            if(!visited.contains(nbrs)) {
                boolean ans = hasPath(nbrs, target, visited);
                if (ans) {
                    return true;
                }
            }
        }
        return false;
    }
}
